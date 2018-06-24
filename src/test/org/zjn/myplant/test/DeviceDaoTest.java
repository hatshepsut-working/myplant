package org.zjn.myplant.test;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zjn.myplant.dao.DeviceDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})

public class DeviceDaoTest {
	@Resource DeviceDao deviceDao;

	@Test
	public void testNewDevice() {
		deviceDao.newDevice(1, 1, 1, 1);
	}

	@Test
	public void testQueryById() {
		System.out.println(deviceDao.queryById(1).toString());
	}

}
