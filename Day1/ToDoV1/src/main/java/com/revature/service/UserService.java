package com.revature.service;

import com.revature.exceptions.UserDoesNotExistException;
import com.revature.models.ToDo;
import com.revature.models.User;

public interface UserService {

	boolean verify(String username, String password);

	User getUser(String username) throws UserDoesNotExistException;

	boolean addTodo(User currentUser, ToDo todo);

}
