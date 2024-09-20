package objectoriented;

public class Circle {
	
	double Radius;
	public Circle() {
		
	}
	public Circle(double radius) {
		Radius=radius;
	}
	public void getArea() {
		System.out.println("Area of circle:"+(Math.PI)*(Math.pow(Radius, 2)));
	}
	public void getPerimeter() {
		System.out.println("perimeter of circle:"+(2*(Math.PI)*Radius));
	}

}
