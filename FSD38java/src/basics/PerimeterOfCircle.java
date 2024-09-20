package basics;

import java.util.Scanner;

public class PerimeterOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		//Perimeter of circle =2*pi*radius
		System.out.println("Enter the values of Radius:");
		int radius =sc.nextInt();
		System.out.println("Perimeter of circle:"+(2*(3.146)*radius));		
	}

}
