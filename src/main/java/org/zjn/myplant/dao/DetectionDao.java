package org.zjn.myplant.dao;

import org.apache.ibatis.annotations.Param;
import org.zjn.myplant.entity.Detection;
import java.util.Date;
import java.util.List;

public interface DetectionDao {
	//��Ӽ���¼
	int newDetection(@Param("deviceId")int deviceId, @Param("plantId")int plantId, @Param("airTemperature")double airTemperature, @Param("airMoisture")double airMoisture, @Param("soilMoisture")double soilMoisture, @Param("detectionTime")Date detectionTime);
	//��ѯ����¼
	List<Detection> queryByDeviceId(int deviceId);

}
