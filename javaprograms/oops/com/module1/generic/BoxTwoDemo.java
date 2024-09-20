package com.module1.generic;

import java.util.ArrayList;
import java.util.List;

public class BoxTwoDemo {
	public static void main(String[] args) {
		BoxTwo<Integer, Integer> b1 = new BoxTwo<>(10, 20);
		BoxTwo<Integer, User> b2 =new BoxTwo<>(10,new User("purushotham","purushotham@gmail.com"));
		BoxTwo<String, ArrayList<Integer>> b3 = new BoxTwo<>("MyArray", new ArrayList<>(List.of(10,20,30)));
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}

}
