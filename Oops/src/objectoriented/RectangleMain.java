package objectoriented;

import java.util.Scanner;

public class RectangleMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length");
		float len=sc.nextFloat();
		System.out.println("Enter bredth");
		float br=sc.nextFloat();
		Rectangle r1=new Rectangle(len,br);
		
//		System.out.println(r1.getArea());
//		System.out.println(r1.getPerimeter());
		System.out.println(r1);
//		System.out.println(Rectangle.getArea());
		
	}

}
