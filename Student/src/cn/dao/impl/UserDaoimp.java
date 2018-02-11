package cn.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.dao.BaseDao;
import cn.dao.UserDao;
import cn.entity.User;

/*
 * @ Copyright (c) Create by JASON  Date:2018-02-10  All rights reserved.
 *
 * @ class description：操作用户
 *
 */
public class UserDaoimp extends BaseDao implements UserDao{

	@Override
	//查找用户
	public boolean findUser(User user) {
		boolean flag = true;
		String sql = "select count(1) from user where `username`=? and `password`=?";
		Object[] params = {user.getUsername(),user.getPassword()};
		ResultSet rs = this.executeQuerySQL(sql, params);
		try {
			while(rs.next()){
				int num = rs.getInt(1);
				if(num>0){
					System.out.println("存在这个用户");
					flag = true;
				}else{
					System.out.println("不存在这个用户");
					flag = false;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	
//	public static void main(String[] args) {
//		UserDao udao = new UserDaoimp();
//		User user = new User();
//		user.setUsername("admins");
//		user.setPassword("admins");
//		udao.findUser(user);
//		
//	}

}


