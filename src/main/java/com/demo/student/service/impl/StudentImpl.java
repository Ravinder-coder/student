package com.demo.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.student.entity.CouseEntity;
import com.demo.student.entity.StudentEntity;
import com.demo.student.model.StudentModel;
import com.demo.student.repo.CourseRepo;
import com.demo.student.repo.StudentRepo;
import com.demo.student.service.StudentService;

@Service
public class StudentImpl implements StudentService{

	@Autowired
	private StudentRepo studentRepo;
	
	@Autowired
	private CourseRepo courseRepo;
	
	@Override
	public StudentEntity insert(StudentModel entity) {
		// TODO Auto-generated method stub
		
		StudentEntity entity2=new StudentEntity();
		entity2.setfName(entity.getfName());
		entity2.setLastName(entity.getLastName());
		entity2.setName(entity.getName());
		entity2.setRollNo(entity.getRollNo());
		
		CouseEntity couseEntity = this.courseRepo.findById(entity.getCourseId()).get();
		
		entity2.setCouseEntity(couseEntity);
		
		this.studentRepo.save(entity2);
		return entity2;
	}

	@Override
	public StudentEntity update(StudentModel entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentEntity getById(long id) {
		// TODO Auto-generated method stub
		return this.studentRepo.findById(id).get();
	}

	@Override
	public List<StudentEntity> getAllData() {
		// TODO Auto-generated method stub
		return this.studentRepo.findAll();
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		this.studentRepo.deleteById(id);
	}

}
