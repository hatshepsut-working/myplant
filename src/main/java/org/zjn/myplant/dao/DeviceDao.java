package org.zjn.myplant.dao;

import org.apache.ibatis.annotations.Param;
import org.zjn.myplant.entity.Device;

public interface DeviceDao {
	//������豸
	int newDevice(@Param("plantId")int plantId, @Param("userId")int userId, @Param("potVolume")int potVolume, @Param("soilQuality")int soilQuality);
	//��ѯ
	Device queryById(int deviceId);

}
