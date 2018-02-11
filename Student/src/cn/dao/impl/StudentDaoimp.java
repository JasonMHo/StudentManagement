package cn.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.dao.BaseDao;
import cn.dao.StudentDao;
import cn.entity.Student;

/*
 * @ Copyright (c) Create by JASON  Date:2018-02-10  All rights reserved.
 *
 * @ class description：对学生表的操作类
 *
 */
public class StudentDaoimp extends BaseDao implements StudentDao {

	@Override
	//获取所有学生信息
	public List<Student> getAllStudent() {
		List<Student> list = new ArrayList<Student>();
		String sql = "select `id`,`name`,`gradeId`,`age`,`sex`,`profile` from student ";
		Object[] params = {};
		ResultSet rs = this.executeQuerySQL(sql, params);
		try {
			while (rs.next()) {
				Student stu = new Student();
				stu.setId(rs.getInt("id"));
				stu.setAge(rs.getInt("age"));
				stu.setGradeId(rs.getInt("gradeId"));
				stu.setSex(rs.getString("sex"));
				stu.setName(rs.getString("name"));
				stu.setProfile(rs.getString("profile"));
				list.add(stu);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	//获取指定学生信息
	public Student getStudentMoreInfo(Student student) {
		Student stu = new Student();
		String sql = "select `name`,`gradeId`,`age`,`sex`,`profile` from student where `id`=?";
		Object[] params = { student.getId() };
		ResultSet rs = this.executeQuerySQL(sql, params);
		try {
			while (rs.next()) {

				stu.setAge(rs.getInt("age"));
				stu.setGradeId(rs.getInt("gradeId"));
				stu.setSex(rs.getString("sex"));
				stu.setName(rs.getString("name"));
				stu.setProfile(rs.getString("profile"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stu;
	}

	@Override
	//添加学生
	public int addStudent(Student student) {
		int row = 0;
		String sql = "insert into student(`id`,`name`,`age`,`sex`,`gradeId`,`profile`) values(?,?,?,?,?,?)";
		Object[] params = {student.getId(),student.getName(),student.getAge(),student.getSex(),student.getGradeId(),student.getProfile()};
		row = this.executeUpdateSQL(sql, params);
		if(row>0){
			System.out.println("增加学生成功");
		}else{
			System.out.println("增加学生失败");
		}
		return row;
	}

	@Override
	//删除学生
	public int delStudent(Student student) {
		int row = 0;
		String sql = "delete from student where `id`=?";
		Object[] params = {student.getId()};
		row = this.executeUpdateSQL(sql, params);
		if(row>0){
			System.out.println("删除学生成功");
		}else{
			System.out.println("删除学生失败");
		}
		return row;
	}

	@Override
	//修改学生信息
	public int modifyStudent(Student student) {
		int row = 0;
		String sql = "update student set `name`=?,`sex`=?,`gradeId`=?,`age`=?,`profile`=?  where `id`=?";
		Object[] params = {student.getName(),student.getSex(),student.getGradeId(),student.getAge(),student.getProfile(),student.getId()};
		row = this.executeUpdateSQL(sql, params);
		if(row>0){
			System.out.println("修改学生成功");
		}else{
			System.out.println("修改学生失败");
		}
		
		return row;
	}
	
	
	//查找指定的学生存在不存在
	public boolean findStudent(Student student){
		boolean flag = true;
		int row = 0;
		String sql = "select count(1) from student where  `name`=? and `age`=? and `sex`=? and `gradeId`=? and `profile`=?";
		Object[] params = {student.getName(),student.getAge(),student.getSex(),student.getGradeId(),student.getProfile()};
		ResultSet rs = this.executeQuerySQL(sql, params);
		try {
			while(rs.next()){
				row = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(row>0){
			System.out.println("此学生已经存在");
			flag = true;
		}else{
			System.out.println("没有这个学生");
			flag = false;
		}
		
		return flag;
		
	}

	
	//测试
//	public static void main(String[] args) {
//		StudentDao sdao = new StudentDaoimp();
//		List<Student> list = sdao.getAllStudent();
//		for (Student stu : list) {
//
//			System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getSex() + "\t" + stu.getAge() + "\t"
//					+ stu.getGradeId() + "\t" + stu.getProfile());
//
//		}
//		Student stud = new Student();
//		stud.setId(1);
//		Student stu = sdao.getStudentMoreInfo(stud);
//		System.out.println(stu.getName() + "\t" + stu.getSex() + "\t" + stu.getAge() + "\t" + stu.getGradeId() + "\t"
//				+ stu.getProfile());
//		stud.setId(14);
//		stud.setAge(20);
//		stud.setSex("男");
//		stud.setGradeId(1);
//		stud.setName("张三");
//		stud.setProfile("我是张三，大好青年 ");
//		sdao.findStudent(stud);
//		sdao.addStudent(stud);
//		sdao.modifyStudent(stud);
//		sdao.delStudent(stud);

//	}

}
