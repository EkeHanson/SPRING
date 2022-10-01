package com.Student.studentManagement.controller;

import com.Student.studentManagement.entity.Student;
import com.Student.studentManagement.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    // Handler method ot handle list student request and return view
   @GetMapping("/student")
    public  String listStudents(Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return "students.html";
    }

    @GetMapping("students/new")
    public  String createStudentForm(Model model){
        //Create student object to hold student form data
       Student student = new Student();
        model.addAttribute("student", student);
        return "create_student.html";
    }
    @PostMapping("/students")
    public  String saveStudent(@ModelAttribute("student") Student student){
       studentService.saveStudents(student);
        return "redirect:/student";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model){
      model.addAttribute("student", studentService.getStudentsById(id));
        return "edit_student.html";
    }
    @PostMapping("/students/{id}")
    public  String updateStudent(@PathVariable Long id,
                                 @ModelAttribute("student") Student student,
                                         Model model){
        //Get student from database by ID
        Student existingStudent = studentService.getStudentsById(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());
        //Save updated student object
        studentService.updateStudents(existingStudent);
        return "redirect:/students";
    }
}
