package com.basics;

public class Student{ 
	public static void main(String[] args) {
		
	}
//if x is 10; 
public static int sum(int x) { 
	if (x <= 1) 
		return 1; 
	if (x % 2 == 0) 
		return 2 + sum(x - 1); 
	if (x % 3 == 0) return 3 + sum(x - 3); 
	if (x % 6 == 0) return 6 + sum(x - 6); 
	return 0; 
	} }