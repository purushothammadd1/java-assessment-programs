package patterns;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		checkLoop(num);

	}

	public static void checkLoop(int num) {
		// TODO Auto-generated method stub
		int i;
//		for(int i = 1;i<=5;i++) {
//			System.out.print(i);
//			for (int i=0;i<=10;i++) {
//				System.out.println(i);
//			}
//		for (int i=0;i<10;++i)
//			if(i%2==0) {
//				System.out.println(i+" ");
//			}	
//		for (int i=0;i<10;i+=2) {
//			System.out.println(i);
//		}
		for (i=0;i<3;i++) {
		
//		for(int j=1;j<=5;j++) {
//			System.out.print(j);
//		}
			for(int j=1;j<=num;j++) {
				System.out.print(j);
			}
			}
	}
	}


