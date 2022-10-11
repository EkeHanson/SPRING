package com.example.PupilManagementSystem.service;

import com.example.PupilManagementSystem.entity.Pupil;
import com.example.PupilManagementSystem.repository.PupilRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PupilServiceImpl implements  PupilService{
    private PupilRepository pupilRepository;

    public PupilServiceImpl(PupilRepository pupilRepository) {
        super();
        this.pupilRepository = pupilRepository;
    }

    @Override
    public List<Pupil> getAllPupils(){
        return  pupilRepository.findAll();
    }

    @Override
    public Pupil savePupils(Pupil pupil) {
        return pupilRepository.save(pupil);
    }

    @Override
    public Pupil updatePupils(Pupil pupil) {
        return pupilRepository.save(pupil);
    }

    @Override
    public Pupil getPupilsById(Long id) {
        return pupilRepository.findById(id).get();
    }

    @Override
    public void deletePupilsById(Long id) {
         pupilRepository.deleteById(id);
    }
}
