package com.module1.java;

public class OuterClass {
	int x=10;
//	static int y=20;
	
	class Inner{
		int x=100;
	public void m1() {
		int x=1000;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println("Third :"+OuterClass.this.x);
		}
	}
	public static void main(String[] args) {
//		OuterClass outer =new OuterClass();
//		OuterClass.Inner i =new OuterClass().new Inner();
//		OuterClass o=new OuterClass();
//		o.m2();
		new OuterClass().new Inner().m1();
		
		
	}
	
}
