package com.module1.generic;

public class BoxDemo {
	public static void main(String[] args) {
		Box<Integer> b1 = new Box(10,20);
		System.out.println(b1);
		
		Box<String> b2 = new Box("Apple","Guava");
		System.out.println(b2);
		
		String ans=(String)b2.x;
		System.out.println(b1.x);
		System.out.println(b2.x);
		System.out.println(ans);
	}

}
