package Intro.java;

import java.awt.Point;

//import java.awt.Point;

public class Circle {
	private Point centre;
	private double radius;
	
	public Circle(Point centre,double radius) {
		this.centre=centre;
		this.radius=radius;
	}
	public double area() {
		return Math.PI*radius*radius;
	}
	public double circumference() {
		return 2*Math.PI*radius;
	}
	public String toString() {
		return "Circle:centre: "+centre+"radius: "+radius;
	}
	
	public int cointains(Point p) {
		double distance=p.distance(centre);
		if(distance > radius)
			return 1;
		else if(distance == radius)
			return 0;
		else
			return -1;
	}
	
	
}
