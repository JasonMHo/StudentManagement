package cn.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.dao.BaseDao;
import cn.dao.GradeDao;
import cn.entity.Grade;

/*
 * @ Copyright (c) Create by JASON  Date:2018-02-10  All rights reserved.
 *
 * @ class description：操作年级
 *
 */
public class GradeDaoimp extends BaseDao implements GradeDao{

	@Override
	//根据年级ID查找年级名
	public Grade getGrade(Grade grade) {
		String sql = "select gradeName from grade where gradeId=?";
		Object[] params = {grade.getGradeId()};
		ResultSet rs = this.executeQuerySQL(sql, params);
		try {
			while(rs.next()){
				grade.setGradeName(rs.getString("gradeName"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return grade;
	}
	
	
	//根据年级年级名查找年级ID
	public Grade getGrade(String gname){
		Grade grade = new Grade();
		String sql = "select gradeId from grade where gradeName=?";
		Object[] params = {gname};
		ResultSet rs = this.executeQuerySQL(sql, params);
		try {
			while(rs.next()){
				grade.setGradeName(gname);
				grade.setGradeId(rs.getInt("gradeId"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return grade;
		
	}
	//测试
//	public static void main(String[] args) {
//		GradeDao gd = new GradeDaoimp();
//		Grade grade = gd.getGrade("G3");
////		grade.setGradeId(2);
//		
//		System.out.println(grade.getGradeId());
//	}

}


