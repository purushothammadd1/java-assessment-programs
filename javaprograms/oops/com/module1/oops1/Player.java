package com.module1.oops1;

public class Player {
	String name;
	private int number;
	private int age;
	
	private int generateNumber(int limit) {
		return (int) (Math.random()*limit);
	}
	void setAge(int age) {
		if(age>=18) {
			this.age=age;
		}
		else {
			this.age=18;
		}
	}
	int getAge() {
		return age;
	}
	void makeGuess(int limit) {
		this.number=generateNumber(limit);
		System.out.println(name +" guessed :"+ number);
	}
	int getNumber() {
		return number;
	}

}
