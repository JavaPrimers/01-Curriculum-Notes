package com.revature.repo;

import java.util.List;

import com.revature.models.ToDo;
import com.revature.models.User;

public interface ToDoDAO {
	
	boolean insertToDo(User u, ToDo todo);
	
	List<ToDo> selectAllTodo();
	List<ToDo> selectUserAllTodo(User u);
	
	boolean updateToDo(ToDo todo, boolean isComplete);
	
	boolean deleteToDo(ToDo todo);

}
