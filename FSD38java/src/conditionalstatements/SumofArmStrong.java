package conditionalstatements;

import java.util.Scanner;

public class SumofArmStrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int sum=0;
		int digit=0;
		int i=1;
		armStrongSum(i,num,sum);
	}

	public static void armStrongSum(int num, int i, int sum) {
		
		while(i<num) {
			
		}
		System.out.println("Sum of the ArmStrong Number: " +sum);
	}

}
