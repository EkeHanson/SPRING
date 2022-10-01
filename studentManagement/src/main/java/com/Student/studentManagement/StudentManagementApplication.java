package com.Student.studentManagement;

import com.Student.studentManagement.entity.Student;
import com.Student.studentManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
		@Override
	public  void run(String... args) throws Exception{
//		Student student1 = new Student("Hanson", "Abraham","ekenehanson@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Besty", "Bliss","eketony@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("Abraham", "Abraham","ogwune@gmail.com");
//		studentRepository.save(student3);
	}
}
