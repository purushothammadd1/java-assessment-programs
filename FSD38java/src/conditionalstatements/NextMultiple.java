package conditionalstatements;

import java.util.Scanner;

public class NextMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		nextMultiple(num);
	}
	public static void nextMultiple(int num) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++) {
			if(i%5==0) {
				System.out.println(i); 
			}
		}
		
		
	}

}
