package org.zjn.myplant.dao;

import org.apache.ibatis.annotations.Param;
import org.zjn.myplant.entity.User;

public interface UserDao {
	//用户注册，插入新用户信息
	int newUser(@Param("userName")String userName, @Param("userPasswd")String userPasswd);
	//用户登录，查询用户信息
	User queryById(int userId);

}
