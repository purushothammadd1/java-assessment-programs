package conditionalstatements;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner pn=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=pn.nextInt();
		System.out.println(perfectNumber(num));

	}

	public static boolean perfectNumber(int num) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		boolean res=(sum==num)?true:false;
		return res;
	}

	

}
