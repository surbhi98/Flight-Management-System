package com.service;



import com.model.User;





public interface UserService {



	public void addUser(User user);

	public void deleteUser(int userId);

	public void updateUser(User user);

	public User getUserById(int userId);

	public User getUserByName(String userName);

}