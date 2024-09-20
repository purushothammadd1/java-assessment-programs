package objectoriented;

public class Rectangle {
	float length;
	float breadth;
	public Rectangle(){
		
	}
	public Rectangle(float l,float b) {
		this.length=l;
		this.breadth=b;
	}	
	public String getArea() {
		//System.out.println("show the area of rectangle:"+(Length*Breadth));
		return "\narea of rectangle:"+(length*breadth);
	}
	public String getPerimeter() {
		//System.out.println("Perimeter of an rectangle:"+(2*(Length+Breadth)));
		return "\nPerimeter of an rectangle:"+(2*(length+breadth));
	}
	public String toString() {
		return "Length"+length+" Breadth"+breadth+ getArea() + getPerimeter();
	}
}


