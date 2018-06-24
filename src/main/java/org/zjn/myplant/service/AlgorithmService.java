package org.zjn.myplant.service;

public interface AlgorithmService {
	
	/*
	 * ���㽽ˮ��
	 */
	int calculateWaterVolume(int deviceId, int plantId);
	
	/*
	 * ������һ�μ��ʱ��
	 */
	long calculateDetectionTime(int deviceId, int plantId);
	
	/*
	 * �����Ƿ�ˮ
	 */
	boolean waterFlag(int plantId, double soilMoisture);
}
