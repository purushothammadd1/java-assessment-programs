package conditionalstatements;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		strongNumber(num);

	}

	public static void strongNumber(int num) {
		// TODO Auto-generated method stub;
		int temp,sum=0; 
		temp= num;
		while(temp>0) {
			int fact = 1;
			int i = 1;
			int rem = temp%10;
			while(i<=rem) {
				fact=fact*i;
				i++;
			}
			System.out.println("The Factorial of"+ rem+"="+fact);
			 sum = sum+fact;
			 temp=temp/10;
		}
		System.out.println("The sum of the factorials of a given number"+ num+"="+sum);
		if(num==sum) {
			System.out.println("\n"+num+" is a strong number");
		}
		else {
			System.out.println("\n"+num+"is Not a Strong Number");
		}
		
		
	}

}
