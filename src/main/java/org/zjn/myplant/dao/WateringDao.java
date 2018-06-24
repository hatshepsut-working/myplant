package org.zjn.myplant.dao;

import org.apache.ibatis.annotations.Param;
import org.zjn.myplant.entity.Watering;
import java.util.Date;
import java.util.List;

public interface WateringDao {
	//添加浇水记录
	int newWatering(@Param("deviceId")int deviceId, @Param("plantId")int plantId, @Param("waterVolume")int waterVolume, @Param("waterTime")Date waterTime, @Param("detectInterval")long detectInterval);
	//查询设备的浇水记录
	List<Watering> queryByDeviceId(int deviceId);

}
