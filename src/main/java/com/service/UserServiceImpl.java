package com.service;



import java.util.List;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;



import com.dao.UserDAO;

import com.model.User;



import com.service.UserService;





@Service

public class UserServiceImpl implements UserService {



	@Autowired

	UserDAO userDAO;

	

	public UserServiceImpl() {

		// TODO Auto-generated constructor stub

	}



	@Override

	@Transactional

	public void addUser(User user) {

		// TODO Auto-generated method stub

		userDAO.save(user);

		

	}







	@Override

	@Transactional

	public void updateUser(User user) {

		// TODO Auto-generated method stub



		userDAO.save(user);

	}



	@Override

	@Transactional

	public User getUserById(int userId) {

		// TODO Auto-generated method stub

		Optional<User>user = userDAO.findById(userId);

		System.out.println(user);

		if(user.isPresent()) return user.get();

		else return null;

	}



	@Override

	@Transactional

	public User getUserByName(String userName) {

		// TODO Auto-generated method stub

		return userDAO.findByUserName(userName);

		

	}



	@Override

	@Transactional

	public void deleteUser(int userId) {

		// TODO Auto-generated method stub

		userDAO.deleteById(userId);

	}



}