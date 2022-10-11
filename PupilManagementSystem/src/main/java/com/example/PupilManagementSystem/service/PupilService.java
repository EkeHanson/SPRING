package com.example.PupilManagementSystem.service;

import com.example.PupilManagementSystem.entity.Pupil;

import java.util.List;

public interface PupilService {
    List<Pupil> getAllPupils();
    Pupil savePupils(Pupil pupil);
    Pupil updatePupils(Pupil pupil);
    Pupil getPupilsById(Long id);
    void deletePupilsById(Long id);
}
