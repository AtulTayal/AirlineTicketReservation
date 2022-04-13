package com.app.airline.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.airline.pojo.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	// Finds the User from database with matching username and password
	User findByUsernameAndPassword(String username, String password);
}
