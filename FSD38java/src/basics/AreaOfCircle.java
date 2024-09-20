package basics;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
				//Area of circle =pi*r^2 (pi value =3.14 )
		//System.out.println("Enter the values of pi:" );
		System.out.println("Enter the values of radius:" );
		
		int radius = sc.nextInt();
		System.out.println("Area of circle:"+(3.146*radius*radius));
		
				

	}

}
