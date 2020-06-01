package com.souvik.org.dao;

import org.springframework.data.repository.CrudRepository;

import com.souvik.org.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer> {

}
