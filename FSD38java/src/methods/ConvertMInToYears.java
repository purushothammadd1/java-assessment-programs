package methods;

import java.util.Scanner;

public class ConvertMInToYears {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Minutes:");
		double mintuesInYear=60*24*365;
		double min=sc.nextDouble();
		long years=(long) (min/mintuesInYear);
		int days=(int)(min/60/24)%365;
		System.out.println((int)min + "minutes is approximately"+ years +"Years and " + days +"days");
		
	}

}
