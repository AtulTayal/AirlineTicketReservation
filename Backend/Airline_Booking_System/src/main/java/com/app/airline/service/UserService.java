package com.app.airline.service;

import java.util.Collection;

import com.app.airline.Login;
import com.app.airline.exception.UserException;
import com.app.airline.pojo.User;

public interface UserService {

	int createUser(User user) throws UserException;

	User fetchUserById(int user_id) throws UserException;

	User validate(Login login);

	public Collection<User> fetchAllUsers();

}
