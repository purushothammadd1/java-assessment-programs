package conditionalstatements;

import java.util.Scanner;

public class ListofPrimeRanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		listOfPrimeRange(num);

	}

	public static void listOfPrimeRange(int num) {
		// TODO Auto-generated method stub
		for(int i=2;i<=num;i++) {
			int fact=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					fact=fact+1;
				}
			}
			if(fact==2)
				System.out.println(i+ " is a prime number");
		}
	}

}
