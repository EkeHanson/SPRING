package com.dailyCodeBuffer.springdatajpatutorial.repository;

import com.dailyCodeBuffer.springdatajpatutorial.entity.Course;
import com.dailyCodeBuffer.springdatajpatutorial.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TeacherRepositoryTest {
    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacher(){
        Course coursePhysics = Course.builder()
                .title("Quantum Physics")
                .credit(10)
                .build();
        Course coursePHP = Course.builder()
                .title("PHP")
                .credit(4)
                .build();
        Course courseJava = Course.builder()
                .title("java")
                .credit(8)
                .build();


      Teacher teacher  =
              Teacher.builder()
                      .firstName("Simon")
                      .lastName("Rowland")
                      .courses(List.of(coursePHP,courseJava,coursePhysics))
                      .build();
      teacherRepository.save(teacher);
    }

}