package com.bajaj.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bajaj.project.dao.StudentDao;
import com.bajaj.project.entity.StudentEntity;

@Service
public class StudentDaoImpl {

	@Autowired
	private StudentDao studentDao;
	
	public void addStudent(int id, String name, int age) {
		StudentEntity studentEntity = new StudentEntity(id,name, age);
		studentDao.save(studentEntity);
	}
	
	
}
