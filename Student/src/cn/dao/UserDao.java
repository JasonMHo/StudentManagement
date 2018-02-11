package cn.dao;

import cn.entity.User;

/*
 * @ Copyright (c) Create by JASON  Date:2018-02-10  All rights reserved.
 *
 * @ class description：用户操作
 *
 */
public interface UserDao {
	
	//查找用户
	public boolean findUser(User user);

}


