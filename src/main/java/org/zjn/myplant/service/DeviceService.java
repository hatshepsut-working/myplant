package org.zjn.myplant.service;

public interface DeviceService {
	
	/*
	 * ��������������Arduino������
	 */
	String receiveMqtt();
	
	/*
	 * ��������Arduino����ָ��
	 */
	void sendMqtt(String instruction);

}
