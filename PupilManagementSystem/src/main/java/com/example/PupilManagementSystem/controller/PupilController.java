package com.example.PupilManagementSystem.controller;

import com.example.PupilManagementSystem.entity.Pupil;
import com.example.PupilManagementSystem.service.PupilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PupilController {
private PupilService pupilService;

    public PupilController(PupilService pupilService) {
        super();
        this.pupilService = pupilService;
    }
    //Handler method to handle list of pupils and return mode and view
    @GetMapping("/pupils")
    public  String listPupil(Model model){
        model.addAttribute("pupils",pupilService.getAllPupils());
        return "pupils";
    }
    @GetMapping("/pupils/new")
    public  String createPupilForm(Model model){
        //Create student object to hold student form data
        Pupil pupil = new Pupil();
        model.addAttribute("pupil",pupil);
        return "create_pupil";
    }
    @PostMapping("/pupils")
    public  String savePupil(@ModelAttribute("pupil") Pupil pupil){
        //Create student object to hold student form data
        pupilService.savePupils(pupil);
        return "redirect:/pupils";
    }
    @GetMapping("/pupils/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model){
        model.addAttribute("pupil", pupilService.getPupilsById(id));
        return "edit_student.html";
    }
    @PostMapping("/pupils/{id}")
    public  String updatePupil(@PathVariable Long id,
         @ModelAttribute("pupil") Pupil pupil, Model model){
        //Get Pupil from database by ID
        Pupil existingStudent = pupilService.getPupilsById(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(pupil.getFirstName());
        existingStudent.setLastName(pupil.getLastName());
        existingStudent.setEmail(pupil.getEmail());
        //Save updated Pupil object
        pupilService.updatePupils(existingStudent);
        return "redirect:/pupils";
    }
//Handler method to handle PUPIL DELETE REQUEST
    @GetMapping("/pupils/{id}")
    public String deletePupil(@PathVariable Long id){
        pupilService.deletePupilsById(id);
        return "redirect:/pupils";
    }
}
