package org.zjn.myplant.service;

public interface AlgorithmService {
	
	/*
	 * 计算浇水量
	 */
	int calculateWaterVolume(int deviceId, int plantId);
	
	/*
	 * 计算下一次检测时间
	 */
	long calculateDetectionTime(int deviceId, int plantId);
	
	/*
	 * 计算是否浇水
	 */
	boolean waterFlag(int plantId, double soilMoisture);
}
