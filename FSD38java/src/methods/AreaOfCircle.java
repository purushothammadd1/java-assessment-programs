package methods;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		//without parameter and without return type
		getRadius();
	}

	public static void getRadius() {
		
		float radius=readData();
		System.out.println("Area of circle:" + (Math.PI)*Math.pow(radius, 2));
		
	}

	public static float readData() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of Radius:");
		float radius=sc.nextFloat();
		return radius;
	}

}
