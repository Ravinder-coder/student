package com.demo.student.service;

import java.util.List;

import com.demo.student.entity.StudentEntity;
import com.demo.student.model.StudentModel;

public interface StudentService {

	public StudentEntity insert(StudentModel entity);
	
	public StudentEntity update(StudentModel entity);
	
	public StudentEntity getById(long id);
	
	public List<StudentEntity> getAllData();
	
	public void deleteById(long id);
	
}
