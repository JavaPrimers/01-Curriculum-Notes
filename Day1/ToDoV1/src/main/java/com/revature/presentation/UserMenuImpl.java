package com.revature.presentation;

import java.util.List;
import java.util.Scanner;

import com.revature.models.ToDo;
import com.revature.models.User;
import com.revature.service.UserService;

public class UserMenuImpl implements UserMenu{
	
	//What is a dependency?
	// Depends on something. 
	
	private UserService userService;
	
	

	public UserMenuImpl(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void showList(List<ToDo> list) {
		
		for(ToDo t: list) {
			System.out.println(t.toString());
		}
		
	}

	@Override
	public void showMenu() {


		System.out.println("Welcome User!");
		System.out.println("Please Choose to Log in [1] or Register [2]");
		
		Scanner sc = new Scanner(System.in); //Is a way of communicating via the terminal.
		
		int choice = Integer.parseInt(sc.nextLine());
		
		switch(choice) {
			case 1: 
				System.out.println("You selected Log in!");
				//User will provide username and password;
				System.out.println("Put in username");
				String username = sc.nextLine();
				System.out.println("Put in password:");
				String password = sc.nextLine();
				
				boolean verified = userService.verify(username,password);
				
				if(verified) {
					System.out.println("You are successfully logged in!");
					
					User currentUser = userService.getUser(username);
					
					System.out.println("What option would you like to select?");
					System.out.println("[1] View all todos"
							+ "[2] Create a new todo"
							+ "[3] Complete a todo"
							+ "[4] Update a todo"
							+ "[5] Delete a todo"
							+ "[6] Logout");
					
					int userChoice = Integer.parseInt(sc.nextLine());
					
					switch(userChoice) {
					case 1:
						this.showList(currentUser.getUserToDoList());
					case 2:
					case 3:
					case 4:
					case 5: 
					case 6:
					}
					//view all todos
					//create new todos 
					//check them (i.e. complete them)
					//delete them 
					//edit todo (update description)
					//log out 
					
				}else {
					System.out.println("Your credentials don't match anything we have!");
				}
				
				break;
			case 2: 
				System.out.println("You selected to Register!");
				break;
			default: 
				System.out.println("You didn't select anything!");
		}
		
			
			
		
	}

}
