package com.springboot.springbootserious;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    //HTTP localhost:8085/student
    @GetMapping("/students")
    public  Student getStudent(){
        return  new Student("Ekene-onwon", "Hanson");
    }
    //HTTP localhost:8085/students
    @GetMapping("/students/list")
    public List<Student> getStudentS(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Rowland","Simon"));
        students.add(new Student("Linus","Awaji-Igbana"));
        students.add(new Student("Caroline","Kinus"));
        students.add(new Student("Belejit","Ekene-onwon"));
        students.add(new Student("Rowland","Simon"));
        students.add(new Student("Linus","Awaji-Igbana"));
        students.add(new Student("Caroline","Kinus"));
        students.add(new Student("Belejit", "Ekene-onwon"));
        students.add(new Student("Rowland","Simon"));
        students.add(new Student("Linus","Awaji-Igbana"));
        students.add(new Student("Caroline","Kinus"));
        students.add(new Student("Belejit","Ekene-onwon"));
        students.add(new Student("Rowland","Simon"));
        students.add(new Student("Linus","Awaji-Igbana"));
        students.add(new Student("Caroline","Kinus"));
        students.add(new Student("Belejit","Ekene-onwon"));
        return students;
    }
    //HTTP localhost:8085/students/page
//    @GetMapping("/students/page")
//    public String getPage(){
//
//    }
}
