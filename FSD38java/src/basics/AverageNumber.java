package basics;

import java.util.Scanner;

public class AverageNumber {
	public static void main(String args []) {
		//Three Numbers as Input to calculate the average number of the given number
		//using scanner 
		Scanner sc =new Scanner(System.in);
		System.out.println("First Number:");
		int x=sc.nextInt();
		
		System.out.println("Second Number:");
		int y=sc.nextInt();
		
		System.out.println("Third Number:");
		int z=sc.nextInt();
		System.out.println("The Input Values are: \n" + average(x,y,z)+"\n");
	}
	
	public static int average(int x, int y, int z) {
		return(x+y+z)/3;
		
	}

	
	}

