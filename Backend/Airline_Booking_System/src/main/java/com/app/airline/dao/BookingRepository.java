package com.app.airline.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.airline.pojo.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

}
