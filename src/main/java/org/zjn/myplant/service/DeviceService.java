package org.zjn.myplant.service;

public interface DeviceService {
	
	/*
	 * 服务器接收来自Arduino的数据
	 */
	String receiveMqtt();
	
	/*
	 * 服务器向Arduino发送指令
	 */
	void sendMqtt(String instruction);

}
