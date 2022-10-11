package com.dailyCodeBuffer.springdatajpatutorial.repository;

import com.dailyCodeBuffer.springdatajpatutorial.entity.Guardian;
import com.dailyCodeBuffer.springdatajpatutorial.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
private StudentRepository studentRepository;

    @Test
    public  void  saveStudent(){
        Student student =  Student.builder()
                .emailId("ekenehanson@gmail.com")
                .firstName("Ekene-onwon")
                .lastName("Hanson")
                //.guardianName("Philip")
                //.guardianEmail("philip@gmail.com")
               // .guardianMobile("0901234567")
                .build();

        studentRepository.save(student);
    }
    @Test
    public  void saveStudentWithGuardian(){
        Guardian guardian = Guardian.builder()
                .name("Philip")
                .email("philip@gmail.com")
                .mobile("0901234567")
                .build();

        Student student = Student.builder()
                .emailId("Belejit@gmail.com")
                .firstName("Belejit")
                .lastName("Mozan")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }

    @Test
    public  void  printAllStudent(){
        List<Student>studentList =
                studentRepository.findAll();
        System.out.println("studentList =  " +studentList);
    }

    @Test
    public void printStudentByFirstName() {
        List <Student> students =
                studentRepository.findByFirstName("Ekene-onwon");
                System.out.println("student = " + students);
    }
    @Test
    public void printStudentByFirstNameContaining() {
        List <Student> students =
                studentRepository.findByFirstNameContaining("Be");
                System.out.println("student = " + students);
    }
    @Test
    public void printStudentBasedOnGuardianName() {
        List <Student> students =
                studentRepository.findByGuardianName("Philip");
                System.out.println("student = " + students);
    }
    @Test
    public  void printGetStudentByEmailAddress(){
        Student students =
                studentRepository.getStudentByEmailAddress("ekenehanson@gmail.com");
        System.out.println("student = " + students);

    }
    @Test
    public  void printGetStudentFirstNameByEmailAddress(){
        String firstName  =
                studentRepository
                        .getStudentFirstNameByEmailAddress("ekenehanson@gmail.com");
        System.out.println("student = " + firstName);

    }
    @Test
    public  void printGetStudentByEmailAddressNative(){
        Student student =
                studentRepository
                        .getStudentByEmailAddressNative("ekenehanson@gmail.com");
        System.out.println("student = " + student);

    }
    @Test
    public  void printGetStudentByEmailAddressNativeNameParam(){
        Student student =
                studentRepository
                        .getStudentByEmailAddressNativeNameParam("ekenehanson@gmail.com");
        System.out.println("student = " + student);

    }
    @Test
    public  void updateStudentNameByEmailIdTest(){
        studentRepository.updateStudentNameByEmailId(
                "Rowland",
                "ekenehanson@gmail.com");
    }

}