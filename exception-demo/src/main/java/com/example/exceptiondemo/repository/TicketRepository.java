package com.example.exceptiondemo.repository;

import com.example.exceptiondemo.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
