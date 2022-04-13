package com.app.airline.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.airline.pojo.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}

