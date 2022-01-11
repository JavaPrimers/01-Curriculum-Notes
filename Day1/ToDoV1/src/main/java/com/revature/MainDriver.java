package com.revature;

import com.revature.presentation.UserMenu;
import com.revature.presentation.UserMenuImpl;
import com.revature.repo.ToDoDAO;
import com.revature.repo.UserDAO;
import com.revature.repo.UserDAOImpl;
import com.revature.service.UserService;
import com.revature.service.UserServiceImpl;
import com.revature.service.UserServiceImplV2;

public class MainDriver {

	public static void main(String[] args) {
		
		//Presentation layer relies on the subsequent layer, the service layer
		
		
		
//		ToDoDAO toDoDao; //Data Access Object, that abstracts away database calls
		UserDAO userDAO = UserDAOImpl.getDao();
		
		//An example of a singleton, where we can instantiate the object only with a public static method.
		UserDAOImpl.getDao();
		
		//To make a class singleton, we can make the constructor private!
		
		UserService userService = new UserServiceImplV2(userDAO); //business logic
		UserMenu userMenu = new UserMenuImpl(userService); //this is what the user sees
		userMenu.showMenu(); //Starts my application up!

	}

}
