package com.revature.models;

import java.util.Objects;

/**
 * This is a documentation comment for this class!
 * 
 * The ToDo is a representation of the data that we will be working with!
 * IT will store states. 
 * @author BenjaminArayathel
 *
 */
public class ToDo {
	
	private int id; //numerical value, making it easier to search and manipulate!
	private String title; //title of the todo task
	private String description; //the description of the todo task
	private boolean complete; //check if its complete
	
	public ToDo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ToDo(int id, String title, String description, boolean complete) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.complete = complete;
	}
	
	@Override
	public String toString() {
		return "ToDo [id=" + id + ", title=" + title + ", description=" + description + ", complete=" + complete + "]";
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(complete, description, id, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ToDo other = (ToDo) obj;
		return complete == other.complete && Objects.equals(description, other.description) && id == other.id
				&& Objects.equals(title, other.title);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}
	
	
	
	

}
