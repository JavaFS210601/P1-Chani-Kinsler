package com.revature.daos;

import com.revature.models.User;

public interface UserInterface {
	
	public void addUser(User user);
	
	public void updateUser(User user);
	
	public User getUser_Id(int user_id);
	
	public boolean removeUser(int user_id);
	

}