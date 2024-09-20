package conditionalstatements;

import java.util.Scanner;

public class SumNaturalNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=sc.nextInt();
		int i=sc.nextInt();
		sumNatural(num,sum,i);

	}

	public static void sumNatural(int num, int sum, int i) {
		// TODO Auto-generated method stub
		while(i<=100) {
			System.out.println(i);
			sum=sum+i;
			i++;
		}
	}

}
