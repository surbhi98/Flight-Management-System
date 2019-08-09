package com.model;



import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.OneToMany;

import javax.persistence.Table;



@Entity

@Table(schema ="hr" , name = "User100")

public class User {



	@Id

	private int userId;

	

	@Column

	private String userName;

	@Column

	private String password;

	//@Column

	//private String email;

	@Column

	private long phone;

	public User() {

		// TODO Auto-generated constructor stub

	}

	public int getUserId() {

		return userId;

	}

	public void setUserId(int userId) {

		this.userId = userId;

	}

	public String getUserName() {

		return userName;

	}

	public void setUserName(String userName) {

		this.userName = userName;

	}

	public String getPassword() {

		return password;

	}

	public void setPassword(String password) {

		this.password = password;

	}

	

	public long getPhone() {

		return phone;

	}

	public void setPhone(long phone) {

		this.phone = phone;

	}

	public User(int userId, String userName, String password, String email, long phone) {

		super();

		this.userId = userId;

		this.userName = userName;

		this.password = password;

		

		this.phone = phone;

	}

	@Override

	public String toString() {

		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", phone=" + phone + "]";

	}

	

}