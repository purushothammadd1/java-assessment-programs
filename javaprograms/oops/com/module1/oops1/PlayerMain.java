package com.module1.oops1;

public class PlayerMain {
	public static void main(String[] args) {
		Player p=new Player();
		p.name="mangesh";
		p.setAge(21);
		p.makeGuess(20);
		
		int lastGuess =p.getNumber();
		System.out.println(lastGuess);
		System.out.println(p.getAge());
	}
}
