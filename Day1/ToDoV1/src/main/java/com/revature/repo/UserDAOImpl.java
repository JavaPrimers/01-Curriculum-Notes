package com.revature.repo;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.ToDo;
import com.revature.models.User;

public class UserDAOImpl implements UserDAO{
	
	private List<User> fakeDatabase;
	
	private static UserDAO userDao;
	

	private UserDAOImpl() {
		super();
		this.fakeDatabase = new ArrayList<>();
		
		//THIS IS ALL HARDCODED DATA, WE WOULD GET THIS FROM THE DB NORMALLY
				ToDo task1 = new ToDo(1, "Shopping", "Get Fruist and Veg", false);
				ToDo task2 = new ToDo(2, "Exercise", "Go Swimming", false);
				ToDo task3 = new ToDo(1, "Appointment", "Go to the doctos appointment", false);
				
				List<ToDo> taskLists = new ArrayList<>();
				
				taskLists.add(task1);
				taskLists.add(task2);
				taskLists.add(task3);
				
				User u = new User("bob", "pass", taskLists);
				
				User u2 = new User("fake","fake", new ArrayList<>());
				
		this.fakeDatabase.add(u);
		
		System.out.println("Database initialized!");
	}

	public static UserDAO getDao() {
		
		if(userDao == null) {
			userDao = new UserDAOImpl();
		}
		//If a UserDao already exists, I never create another one. 
		//In essence I've created a singleton. 
		return userDao;
	}
	
	@Override
	public boolean insertUser(User u) {

		this.fakeDatabase.add(u);
		return true;
	}

	@Override
	public User selectUserById(int id) {
		
		return null;
	}

	@Override
	public User selectUserByName(String username) {
		User user = null;
		
		for(User u: this.fakeDatabase) {
			if(u.getUsername().equals(username)) {
				user = u;
			}
		}
		return user;
	}

	@Override
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		return this.fakeDatabase;
	}

	@Override
	public boolean updateUser(String username, User newUser) {
		for(User u: this.fakeDatabase) {
			if(u.getUsername().equals(username)) {
				u.setPassword(newUser.getPassword());
				u.setUserToDoList(newUser.getUserToDoList());
			}
		}
		return false;
	}

	@Override
	public boolean deleteUser(User u) {
		User deleteUser = null;
		for(User i: this.fakeDatabase) {
			if(i.getUsername().equals(u.getUsername())) {
				deleteUser = i;
				break;
			}
		}
		
		this.fakeDatabase.remove(deleteUser);
		return true;
	}

	
}
