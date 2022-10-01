package com.Student.studentManagement.repository;

import com.Student.studentManagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {




}
