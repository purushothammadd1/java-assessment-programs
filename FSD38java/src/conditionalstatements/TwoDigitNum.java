package conditionalstatements;

import java.util.Scanner;

public class TwoDigitNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		System.out.println(nearestMultiple(num));

	}

	public static int nearestMultiple(int num) {
		// TODO Auto-generated method stub
		int a=(num/5)*5;
		int b=a+5;
		return (num-a>b-num)?b:a;
		
	}

}
