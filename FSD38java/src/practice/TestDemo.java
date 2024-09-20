package practice;

import java.util.Scanner;

public class TestDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		findNumber(a, b);
	}

	public static void findNumber(int a, int b) {
		// TODO Auto-generated method stub
		int c=0,sum=0;
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				c++;
				sum +=i;
			}
		}
		System.out.println((float)sum/c);

	}

}
