package org.zjn.myplant.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.core.MessageProducer;
import org.springframework.integration.mqtt.inbound.MqttPahoMessageDrivenChannelAdapter;
import org.springframework.integration.mqtt.support.DefaultPahoMessageConverter;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zjn.myplant.dao.DetectionDao;
import org.zjn.myplant.dao.DeviceDao;
import org.zjn.myplant.dao.WateringDao;
import org.zjn.myplant.service.MqttInboundService;

import net.sf.json.JSONObject;

@Service
@Configuration
@EnableIntegration
@IntegrationComponentScan
//@MessageEndpoint ²»±ØÒª
public class MqttInboundServiceImpl implements MqttInboundService{

	@Autowired
	DeviceDao deviceDao;
	@Autowired
	WateringDao wateringDao;
	@Autowired
	DetectionDao detectionDao;
	@Autowired
	AlgorithmServiceImpl algorithmServiceImpl;
	@Autowired
	MqttOutboundServiceImpl mqttOutboundServiceImpl;
	@Override
	@Bean
	public MessageChannel mqttInputChannel() {
		// TODO Auto-generated method stub
		return new DirectChannel();
		//return new FixedSubscriberChannel();
	}

	@Override
	@Bean
	public MessageProducer inbound() {
		// TODO Auto-generated method stub
		MqttPahoMessageDrivenChannelAdapter adapter =  
                new MqttPahoMessageDrivenChannelAdapter("tcp://47.93.55.173:1883", "SpringServer", "MyPlant/Arduino/data/+");
		//adapter.getTopic();
        adapter.setCompletionTimeout(5000);  
        adapter.setConverter(new DefaultPahoMessageConverter());  
        adapter.setQos(1);  
        adapter.setOutputChannel(mqttInputChannel());  
        return adapter;  
	}

	@Override
	@Bean
	@ServiceActivator(inputChannel = "mqttInputChannel")
	public MessageHandler handler() {
		// TODO Auto-generated method stub
			return new MessageHandler() {    
	            @Override  
	            //@Transactional
	            public void handleMessage(Message<?> message) throws MessagingException {  
	            	JSONObject obj = JSONObject.fromObject(message.getPayload());
	            	System.out.println(obj.toString());
	            	int deviceId = Integer.parseInt(obj.get("clientID").toString());
	            	int plantId = deviceDao.queryById(deviceId).getPlantId();
	            	double soilMoisture = Double.parseDouble(obj.get("SM").toString());
	            	double airTemperature = Double.parseDouble(obj.get("AT").toString());
	            	double airMoisture = Double.parseDouble(obj.get("AM").toString());
	            	detectionDao.newDetection(deviceId, plantId, airTemperature, airMoisture, soilMoisture, new Date());
	            	long detectInterval = algorithmServiceImpl.calculateDetectionTime(deviceId, plantId);
            		JSONObject newobj = new JSONObject();
	            	if(algorithmServiceImpl.waterFlag(plantId, soilMoisture)) {
	            		int waterVolume = algorithmServiceImpl.calculateWaterVolume(deviceId, plantId);
	            		newobj.put("clientID", deviceId);
	            		newobj.put("WF", 1);
	            		newobj.put("water", waterVolume);
	            		newobj.put("detectInterval", detectInterval);
	            		wateringDao.newWatering(deviceId, plantId, waterVolume, new Date(), detectInterval);
	            	}else {
	            		newobj.put("clientID", deviceId);
	            		newobj.put("WF", 0);
	            		newobj.put("water", 0);
	            		newobj.put("detectInterval", detectInterval);
	            	}
	            	if(newobj.get("WF") == new Integer(1)) {
	            		System.out.println(newobj.toString());
	            		mqttOutboundServiceImpl.sendMqtt(newobj.toString(), deviceId);
	            	}
	            }  
	  
	        };
	}
}