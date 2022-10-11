package com.spring.comferencedemo.Repository;
import com.spring.comferencedemo.Models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SpeakerRepository extends JpaRepository<Speaker,Long> {

    void deleteById(Long id);
}
