package com.demo.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.student.entity.CouseEntity;


@Repository
public interface CourseRepo extends JpaRepository<CouseEntity, Long>{

}
