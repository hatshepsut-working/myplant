package org.zjn.myplant.test;

import org.zjn.myplant.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})

public class UserDaoTest {
	
	@Autowired 
	private UserDao userDao;

	@Test
	public void testNewUser() {
		System.out.println("start.");
		System.out.println(Test.class.getResource("/").toString());
		String a = "dfsf", b = "cccc";
		//java没有保存形参的记录
		userDao.newUser(a, b);
		System.out.println("success.");
	}

	@Test
	public void testQueryById() {
		System.out.println(userDao.queryById(1).toString());
		
	}

}
