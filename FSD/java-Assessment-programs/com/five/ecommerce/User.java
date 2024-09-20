package com.five.ecommerce;

public class User {
	private String username;
	private String password;
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getusername() {
		return username;
	}
	
	public boolean validatepassword(String inputPassword) {
		return this.password.equals(inputPassword);
	}
}
