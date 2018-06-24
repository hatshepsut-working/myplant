package org.zjn.myplant.dao;

import org.apache.ibatis.annotations.Param;
import org.zjn.myplant.entity.Watering;
import java.util.Date;
import java.util.List;

public interface WateringDao {
	//��ӽ�ˮ��¼
	int newWatering(@Param("deviceId")int deviceId, @Param("plantId")int plantId, @Param("waterVolume")int waterVolume, @Param("waterTime")Date waterTime, @Param("detectInterval")long detectInterval);
	//��ѯ�豸�Ľ�ˮ��¼
	List<Watering> queryByDeviceId(int deviceId);

}
