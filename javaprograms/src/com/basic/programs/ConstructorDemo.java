package com.basic.programs;

public class ConstructorDemo {
	ConstructorDemo(double d) {
		System.out.println("double argument constructor");
	}
	ConstructorDemo(int i) {
		this(10.5);
		System.out.println("int argument constructor");
	}
	ConstructorDemo(){
		this(10);
		System.out.println("no argument constructor");
	}
}
