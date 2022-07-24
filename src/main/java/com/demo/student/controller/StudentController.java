package com.demo.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.student.entity.StudentEntity;
import com.demo.student.model.StudentModel;
import com.demo.student.service.StudentService;

@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/")
	public StudentEntity insert(@RequestBody StudentModel entity) {
		return this.studentService.insert(entity);
	}
	
	@PutMapping("/")
	public StudentEntity update(@RequestBody StudentModel entity) {
		return this.studentService.update(entity);
	}
	
	@GetMapping("/")
	public List<StudentEntity> getAll() {
		return this.studentService.getAllData();
	}
	
	@GetMapping("/{id}")
	public StudentEntity getAll(@PathVariable("id") long id) {
		return this.studentService.getById(id);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id) {
		 this.studentService.deleteById(id);
	}
	
}
