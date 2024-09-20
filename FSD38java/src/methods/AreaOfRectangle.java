package methods;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//with parameters
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of length:");
		float length=sc.nextFloat();
		
		System.out.println("Enter the value of breadth:");
		float breadth=sc.nextFloat();
		
		getArea(length,breadth);

	}
	//without return
	public static void getArea(float length, float breadth) {
		// TODO Auto-generated method stub
		System.out.println("Area of Rectangle:"+ (length*breadth));
		
	}

}
