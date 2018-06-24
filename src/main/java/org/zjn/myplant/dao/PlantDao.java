package org.zjn.myplant.dao;

import org.apache.ibatis.annotations.Param;
import org.zjn.myplant.entity.Plant;

public interface PlantDao {
	//���ֲ����Ϣ
	int newPlant(@Param("plantName")String plantName, @Param("temperatureMin")double temperatureMin, @Param("temperatureMax")double temperatureMax, @Param("moistureMin")double moistureMin, @Param("moistureMax")double moistureMax);
	//��ѯֲ����Ϣ
	Plant queryById(int plantId);

}
