package cn.service;

import java.util.List;

import cn.entity.Student;

/*
 * @ Copyright (c) Create by JASON  Date:2018-02-10  All rights reserved.
 *
 * @ class description：操作学生
 *
 */
public interface StudentService {
	//获取所有学生信息
	public List<Student> getAllStudent();
	//获取指定学生信息
	public Student getStudentMoreInfo(Student student);
	//添加学生
	public int addStudent(Student student);
	//删除学生
	public int delStudent(Student student);
	//修改学生信息
	public int modifyStudent(Student student);
	//查找有没有指定的学生
	public boolean findStudent(Student student);
}


