package conditionalstatements;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {

		Scanner as=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=as.nextInt();
		System.out.println(armStrongNumber(num));
	}

	public static boolean armStrongNumber(int num) {
		int sum=0;
		int temp=num;
		while(num>0) {
			sum +=Math.pow(num%10, 3);
			num=num/10;
		}
		boolean res=(temp==sum)?true:false;
		return res;
	}	
}