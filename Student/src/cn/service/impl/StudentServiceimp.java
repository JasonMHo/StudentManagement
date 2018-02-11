package cn.service.impl;

import java.util.List;

import cn.dao.StudentDao;
import cn.dao.impl.StudentDaoimp;
import cn.entity.Student;
import cn.service.StudentService;

/*
 * @ Copyright (c) Create by JASON  Date:2018-02-10  All rights reserved.
 *
 * @ class description：操作学生
 *
 */
public class StudentServiceimp implements StudentService{
	private StudentDao studentDao = null;
	
	public StudentServiceimp(){
		studentDao = new StudentDaoimp();
	}

	@Override
	//获取所有学生信息
	public List<Student> getAllStudent() {
		return studentDao.getAllStudent();
	}

	@Override
	//获取指定学生信息
	public Student getStudentMoreInfo(Student student) {
		return studentDao.getStudentMoreInfo(student);
	}

	@Override
	//添加学生
	public int addStudent(Student student) {
		return studentDao.addStudent(student);
	}

	@Override
	//删除学生
	public int delStudent(Student student) {
		return studentDao.delStudent(student);
	}

	@Override
	//修改学生信息
	public int modifyStudent(Student student) {
		return studentDao.modifyStudent(student);
	}
	
	//查找有没有指定的学生
	public boolean findStudent(Student student){
		return studentDao.findStudent(student);
				
	}

}


