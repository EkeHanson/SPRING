package com.dailyCodeBuffer.springdatajpatutorial.repository;
import com.dailyCodeBuffer.springdatajpatutorial.entity.Course;
import com.dailyCodeBuffer.springdatajpatutorial.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository repository;

    @Test
    public  void saveCourseMaterial(){
        Course course =
                Course.builder()
                        .title(".net")
                        .credit(6)
                        .build();

        CourseMaterial courseMaterial =
                CourseMaterial.builder()
                        .url("www.dailyCodebuffer.com")
                        .course(course)
                        .build();
        repository.save(courseMaterial);
    }
    @Test
    public void printAllCourses(){
    List<CourseMaterial> courseMaterial =
            repository.findAll();
        System.out.println("CourseMaterials = " +courseMaterial);
    }
}