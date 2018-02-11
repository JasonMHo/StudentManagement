package cn.dao;

import cn.entity.Grade;

/*
 * @ Copyright (c) Create by JASON  Date:2018-02-10  All rights reserved.
 *
 * @ class description：操作年级
 *
 */
public interface GradeDao {
	//根据年级ID查找年级名
	public Grade getGrade(Grade grade);
	
	//根据年级年级名查找年级ID
	public Grade getGrade(String gname);

}


