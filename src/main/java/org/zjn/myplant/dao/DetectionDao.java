package org.zjn.myplant.dao;

import org.apache.ibatis.annotations.Param;
import org.zjn.myplant.entity.Detection;
import java.util.Date;
import java.util.List;

public interface DetectionDao {
	//Ìí¼Ó¼ì²â¼ÇÂ¼
	int newDetection(@Param("deviceId")int deviceId, @Param("plantId")int plantId, @Param("airTemperature")double airTemperature, @Param("airMoisture")double airMoisture, @Param("soilMoisture")double soilMoisture, @Param("detectionTime")Date detectionTime);
	//²éÑ¯¼ì²â¼ÇÂ¼
	List<Detection> queryByDeviceId(int deviceId);

}
