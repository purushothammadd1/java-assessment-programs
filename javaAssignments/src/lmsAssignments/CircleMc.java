package lmsAssignments;

public class CircleMc {
	private double radius;
	
	public CircleMc() {
		radius=2.0;
	}
	public CircleMc(double dia) {
		this.radius=dia;
	}
	public double getDiameter() {
		return radius;
	}
	public void setDiameter(double rad) {
		this.radius=rad;
	}
	public double getArea() {
		return 4*(Math.PI)*(Math.pow(radius, 2));
	}
	public double getCircumference() {
		return Math.PI*radius;
	}
	public String toString() {
		return "Area of Circle:"+radius;
	}

}
