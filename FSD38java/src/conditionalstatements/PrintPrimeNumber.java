package conditionalstatements;

import java.util.Scanner;

public class PrintPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		primeNumbertonum(num);	
	}
	public static void primeNumbertonum(int num) {
		// TODO Auto-generated method stub
		for(int i=1;i<=num;i++)
		{
			int fact=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					fact++;
				}
			}
			if(fact==2) {
				System.out.println(i);
			}
		}
		
	}

}
