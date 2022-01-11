package com.revature.repo;

import java.sql.SQLException;
import java.util.List;

import com.revature.models.User;

/**
 * DAO stands for Data Access Object
 * The purpose of the DAO is to provide CRUD operations that act upon our database
 * This allows the rest of the JAva code to leverage it to communicate with our DB
 * 
 * (I'm going to make a fake db with just a Collection entity)
 * @author BenjaminArayathel
 *
 */
public interface UserDAO {
	
	boolean insertUser(User u) throws SQLException;
	
	User selectUserById(int id);
	User selectUserByName(String username);
	List<User> selectAll();
	
	boolean updateUser(String username, User newUser); //Replace User object with username with new object newUser
	
	boolean deleteUser(User u);
	
	

}
