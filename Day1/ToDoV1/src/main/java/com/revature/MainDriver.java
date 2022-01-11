package com.revature;

import com.revature.presentation.UserMenu;
import com.revature.presentation.UserMenuImpl;
import com.revature.repo.ToDoDAO;
import com.revature.repo.UserDAO;
import com.revature.service.UserService;
import com.revature.service.UserServiceImpl;

public class MainDriver {

	public static void main(String[] args) {
		
		//Presentation layer relies on the subsequent layer, the service layer
		
		
		UserService userService = new UserServiceImpl(); //business logic
		ToDoDAO toDoDao; //Data Access Object, that abstracts away database calls
		UserDAO userDAO;
		
		UserMenu userMenu = new UserMenuImpl(userService); //this is what the user sees
		userMenu.showMenu(); //Starts my application up!

	}

}
