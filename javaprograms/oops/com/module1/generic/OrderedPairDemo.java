package com.module1.generic;

public class OrderedPairDemo {
	public static void main(String[] args) {
		OrderedPair<Integer, String> op = new OrderedPair<>(10, "Hello");
		System.out.println(op.getKey());
		System.out.println(op.getValue());
		
		OrderedPair op2 =new OrderedPair(10, "Hello");
		System.out.println(op2);
		
		OrderedPair op3 =new OrderedPair(10,new User("purushotham","purushotham@gmail.com"));
		System.out.println(op3);
	}

}
