package com.Student.studentManagement.service;
import com.Student.studentManagement.entity.Student;
import java.util.List;

public interface StudentService {
    List <Student>getAllStudents();
    Student saveStudents(Student student);
    Student getStudentsById( Long id);
    Student updateStudents(Student student);


}
