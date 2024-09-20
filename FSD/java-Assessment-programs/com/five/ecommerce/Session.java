package com.five.ecommerce;

public class Session {
	private static User loggedInUser = null;
	
	public static void login(User user) {
		loggedInUser = user;
		System.out.println("Welcome, "+user.getusername()+"!");
	}
	public static void logout() {
		loggedInUser=null;
		System.out.println("You have been logged out.");
	}
	public static boolean isAuthenticated() {
		return loggedInUser != null;
	}

}
