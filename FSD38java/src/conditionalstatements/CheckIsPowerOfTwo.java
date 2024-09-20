package conditionalstatements;

import java.util.Scanner;

public class CheckIsPowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		System.out.println(checkPower(num));
	}
	public static String checkPower(int num) {
		// TODO Auto-generated method stub
		int pow=0,temp=0;
		while(temp<num) {
			temp=(int)(Math.pow(3, pow));
			pow++;
		if(temp==num) {
			return "True";
		}
		}
		return "false";
		
	}

}
