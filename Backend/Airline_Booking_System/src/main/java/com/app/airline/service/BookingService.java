package com.app.airline.service;

import java.util.List;

import com.app.airline.pojo.Booking;
import com.app.airline.pojo.Passenger;
import com.app.airline.pojo.Ticket;

public interface BookingService {

	int addBooking(Booking booking);

	int addPassenger(Passenger passenger, int bookingId);

	List<Ticket> getTicket(int uid);

	Ticket generateTicket(Ticket ticket, int userId, int bookingId);

	void updateBooking(Booking bookPay);

	Booking getBookingById(int bid);

}
