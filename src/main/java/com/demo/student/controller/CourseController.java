package com.demo.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.student.entity.CouseEntity;
import com.demo.student.repo.CourseRepo;

@RestController
@CrossOrigin
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CourseRepo courseRepo;
	
	@PostMapping("/")
	public CouseEntity couseEntity(@RequestBody CouseEntity couseEntity) {
		return this.courseRepo.save(couseEntity);
	}
	
	@GetMapping("/")
	public List<CouseEntity> getAllData() {
		return this.courseRepo.findAll();
	}
	
}
