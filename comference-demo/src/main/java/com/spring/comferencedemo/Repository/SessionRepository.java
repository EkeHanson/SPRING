package com.spring.comferencedemo.Repository;

import com.spring.comferencedemo.Models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Long>{

    void deleteById(Long id);
}


