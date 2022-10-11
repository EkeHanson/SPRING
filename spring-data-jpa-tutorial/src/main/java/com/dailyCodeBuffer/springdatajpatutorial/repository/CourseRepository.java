package com.dailyCodeBuffer.springdatajpatutorial.repository;

import com.dailyCodeBuffer.springdatajpatutorial.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository <Course, Long>{

}
