package org.zjn.myplant.web;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zjn.myplant.dao.DetectionDao;
import org.zjn.myplant.service.impl.MqttInboundServiceImpl;

//����ǰcontroller����spring������
//url:/ģ��/��Դ/{id}/ϸ�� /seckill/list
@Controller
@RequestMapping(value="/")
public class MyplantController {
	@Autowired
	MqttInboundServiceImpl serviceimpl;
	@Autowired
	DetectionDao detectionDao;
	@RequestMapping(value="/welcome", method = RequestMethod.GET)
	public String list(ModelMap model) {
		model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
		int result = detectionDao.newDetection(2, 1, 777, 999, 888, new Date());
		System.out.println(result);
		return "welcome";
	}
}