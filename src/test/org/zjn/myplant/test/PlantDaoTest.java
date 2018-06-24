package org.zjn.myplant.test;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zjn.myplant.dao.PlantDao;
import org.zjn.myplant.dao.UserDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})

public class PlantDaoTest {
	
	@Resource PlantDao plantDao;

	@Test
	public void testNewPlant() {
		plantDao.newPlant("”Ò¿º", 12, 13, 11, 14);
	}

	@Test
	public void testQueryById() {
		System.out.println(plantDao.queryById(1).toString());
	}

}
