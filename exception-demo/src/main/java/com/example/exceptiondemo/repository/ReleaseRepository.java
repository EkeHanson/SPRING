package com.example.exceptiondemo.repository;

import com.example.exceptiondemo.entity.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release, Long> {
}