package com.revature.service;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.ToDo;
import com.revature.models.User;

public class UserServiceImpl implements UserService {

	@Override
	public boolean verify(String username, String password) {

		if(username.equals("bob") && password.equals("pass")) {
			return true;
		}
		return false;
	}

	@Override
	public User getUser(String username) {
		
		
		//THIS IS ALL HARDCODED DATA, WE WOULD GET THIS FROM THE DB NORMALLY
		ToDo task1 = new ToDo(1, "Shopping", "Get Fruist and Veg", false);
		ToDo task2 = new ToDo(2, "Exercise", "Go Swimming", false);
		ToDo task3 = new ToDo(1, "Appointment", "Go to the doctos appointment", false);
		
		List<ToDo> taskLists = new ArrayList<>();
		
		taskLists.add(task1);
		taskLists.add(task2);
		taskLists.add(task3);
		
		User u = new User("bob", "pass", taskLists);
		
		return u;
	}

}
