package com.app.airline.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.airline.pojo.Ticket;
import com.app.airline.pojo.User;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
	// Finds the list of tickets by user
	List<Ticket> findByUser(User user);
}

