package methods;

import java.util.Scanner;

public class NoOfInchesConverttoMeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value of Inches:");
		double inch=sc.nextDouble();
		double meters=inch*0.0254;
		System.out.println("Inch is " + inch + meters + " meters");

	}

}
