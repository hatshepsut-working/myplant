package org.zjn.myplant.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zjn.myplant.dao.DeviceDao;
import org.zjn.myplant.dao.PlantDao;
import org.zjn.myplant.service.*;

@Service
public class AlgorithmServiceImpl implements AlgorithmService{

	@Autowired
	PlantDao plantDao;
	@Autowired
	DeviceDao deviceDao;
	@Override
	public boolean waterFlag(int plantId, double soilMoisture) {
		// TODO Auto-generated method stub
		double moistureMax = plantDao.queryById(plantId).getMoistureMax();
		double moistureMin = plantDao.queryById(plantId).getMoistureMin();
		if(soilMoisture < moistureMin) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public int calculateWaterVolume(int deviceId, int plantId) {
		// TODO Auto-generated method stub
		int potVolume = deviceDao.queryById(deviceId).getPotVolume();
		double moistureMax = plantDao.queryById(plantId).getMoistureMax();
		double moistureMin = plantDao.queryById(plantId).getMoistureMin();
		//return (int)(potVolume * (moistureMax - moistureMin));
		return 3;
	}

	@Override
	public long calculateDetectionTime(int deviceId, int plantId) {
		// TODO Auto-generated method stub
		long detectInterval = 20;
		return detectInterval;
	}

}
