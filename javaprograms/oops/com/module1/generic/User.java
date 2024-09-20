package com.module1.generic;

public class User {
	protected String name;
	protected String email;
	
	public User() {
		System.out.println("Cretaing a user");
	}
	public User(String name,String email) {
		this.name=name;
		this.email=email;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + "]";
	}
}
