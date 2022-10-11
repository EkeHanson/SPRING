package com.example.exceptiondemo.repository;


import com.example.exceptiondemo.entity.Application;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Application, Long> {
}
