package com.example.PupilManagementSystem.repository;

import com.example.PupilManagementSystem.entity.Pupil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PupilRepository extends JpaRepository<Pupil,Long> {

}
