//package lmsAssignments;
//
//interface GeometricObject {
//	public double getPerimeter();
//	public double getArea();
//}
//public class Circle implements GeometricObject{
//	protected double radius;
//	public Circle(double radius) {
//		super();
//		this.radius=radius;
//	}
//	public String toString() {
//		return "Circle[radius="+radius+"]";
//	}
//	
//	
//	public double getPerimeter() {
//		// TODO Auto-generated method stub
//		return 2*Math.PI*radius;
//	}
//
//
//	public double getArea() {
//		// TODO Auto-generated method stub
//		return Math.PI*radius*radius;
//	}
//	
//	
//}
//interface Resizable{
//	public void resize(int percent);
//}
//public class ResizableCircle extends Circle implements Resizable{
//	public ResizableCircle(double radius) {
//		super(radius);
//	}
//	public String toString() {
//		return "ResizableCircle[circle[radius="+radius+"]]";
//	}
//	public void resize(int percent) {
//		radius *=percent/100.0;
//	}
//}