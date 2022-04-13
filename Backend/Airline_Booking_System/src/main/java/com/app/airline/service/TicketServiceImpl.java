package com.app.airline.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.airline.dao.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketRepository trepo;

	@Transactional
	@Override
	public void removeTicket(int ticketNumber) {

		trepo.deleteById(ticketNumber);
		System.out.println("Ticket Cancelled...");
	}

}
