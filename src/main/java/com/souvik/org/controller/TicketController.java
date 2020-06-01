package com.souvik.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.souvik.org.dao.TicketDao;
import com.souvik.org.model.Ticket;

@RestController
@RequestMapping("/ticket")
public class TicketController {
	@Autowired
	private TicketDao ticketdao;
	
	@RequestMapping(value="/bookTicket", method=RequestMethod.POST)
	public String bookTicket(@RequestBody List<Ticket> tickets) {
		ticketdao.saveAll(tickets);
		return "ticket booked " + tickets.size();
	}
	
	@RequestMapping(value="/getTickets", method = RequestMethod.GET)
	public List<Ticket> getTickets(){
		return (List<Ticket>)ticketdao.findAll();
	}
}
