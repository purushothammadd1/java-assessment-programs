package basics;

import java.util.Scanner;

public class VarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner var =new Scanner(System.in);
		// Adding the Variables and Datatypes in java program
		
		int StudId =var.nextInt();
		System.out.println("Enter Student Id:" +StudId);
		
		int Name =var.nextInt();
		System.out.println("Student Name:" + Name);
		
		float Marks=var.nextFloat();
		System.out.println("Student Marks: " + Marks);

	}

}
