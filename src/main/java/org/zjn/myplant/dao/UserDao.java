package org.zjn.myplant.dao;

import org.apache.ibatis.annotations.Param;
import org.zjn.myplant.entity.User;

public interface UserDao {
	//�û�ע�ᣬ�������û���Ϣ
	int newUser(@Param("userName")String userName, @Param("userPasswd")String userPasswd);
	//�û���¼����ѯ�û���Ϣ
	User queryById(int userId);

}
