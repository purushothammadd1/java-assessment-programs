package com.module1.generic;

public class NumberBoxDemo {
	public static void main(String[] args) {
		NumberBox<Integer> nb1 = new NumberBox<>(10);
		System.out.println(nb1);
		
		NumberBox<Double> nb2 = new NumberBox<>(10.35);
		System.out.println(nb2);
	}
}
