package com.one;

public class Tester {
	public static void main(String[] args) {
		Shape circle = new Circle(5);
		Shape triangle = new Triangle(3.0, 4.0, 5.0);
		
		System.out.println("Circle Area is "+circle.calculateArea());
		System.out.println("Circle Perimeter is "+circle.calculatePerimeter());
		System.out.println("------------------------------------");
		System.out.println("Circle Area is "+triangle.calculateArea());
		System.out.println("Circle Perimeter is "+triangle.calculatePerimeter());
	}

}
