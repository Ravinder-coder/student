package com.demo.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.student.entity.StudentEntity;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity, Long>{

}
