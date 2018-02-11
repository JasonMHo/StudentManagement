package cn.service.impl;

import cn.dao.GradeDao;
import cn.dao.impl.GradeDaoimp;
import cn.entity.Grade;
import cn.service.GradeService;

/*
 * @ Copyright (c) Create by JASON  Date:2018-02-10  All rights reserved.
 *
 * @ class description：操作年级
 *
 */
public class GradeServiceimp implements GradeService {
	private GradeDao gradeDao= null;
	
	public GradeServiceimp(){
		gradeDao = new GradeDaoimp();
	}

	@Override
	//根据年级ID查找年级名
	public Grade getGrade(Grade grade) {
		return gradeDao.getGrade(grade);
	}
	
	//根据年级年级名查找年级ID
	public Grade getGrade(String gname){
		return gradeDao.getGrade(gname);
	}

}


