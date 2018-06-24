package org.zjn.myplant.dao;

import org.apache.ibatis.annotations.Param;
import org.zjn.myplant.entity.Plant;

public interface PlantDao {
	//添加植物信息
	int newPlant(@Param("plantName")String plantName, @Param("temperatureMin")double temperatureMin, @Param("temperatureMax")double temperatureMax, @Param("moistureMin")double moistureMin, @Param("moistureMax")double moistureMax);
	//查询植物信息
	Plant queryById(int plantId);

}
