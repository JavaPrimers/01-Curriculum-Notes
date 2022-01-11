package com.revature.service;

import com.revature.models.ToDo;
import com.revature.models.User;
import com.revature.repo.UserDAO;

public class UserServiceImplV2 implements UserService{
	
	private UserDAO uDao;

	public UserServiceImplV2( UserDAO uDao) {
		super();
		this.uDao = uDao;
	}

	@Override
	public boolean verify(String username, String password) {

		User u = uDao.selectUserByName(username);
		boolean verified = false;
		
		if(u == null) { //user doesn't exist by that username
			verified = false;
		}else if(!u.getPassword().equals(password)) { //if password doesn't match
			verified = false;
		}else {
			verified = true;
		}
		
		return verified;
	}

	@Override
	public User getUser(String username) {

		User u = uDao.selectUserByName(username);
		return u;
	}

	@Override
	public boolean addTodo(User currentUser, ToDo todo) {
		
		User updatedUser = currentUser;
		updatedUser.getUserToDoList().add(todo);
		

		return uDao.updateUser(currentUser.getUsername(), updatedUser);
	
	}

}
