package nestedloop;

import java.util.Scanner;

public class AlphabetLetter_OPQ {

	public static void main(String[] args) {
		
		
			letterAlphabetO();
			
			letterAlphabetP();
			
			letterAlphabetQ();
			
		}
	public static void letterAlphabetO() {
		for(int i=0;i <=6;i++) {
			for (int j=0;j <=6 ;j++) {
			
				if(((i>=1 && i <6) && (j==0 || j==6)) || ((i==0 || i==6) && (j>0 &&j<6)))  {
					System.out.print("O");
				}else{
					System.out.print(" ");
				}
				
			}
				System.out.println( );
			}
			
		}
	public static void letterAlphabetP() {
		int i,j;
		for(i=0;i<7;i++) {
			for(j=0;j<7;j++) {
				if(((i==0 || i==3) && (j<6))||(i>0 &&  i<3)&&(j==0 || j==6)||(i>3 && j==0)) {
					System.out.print("P");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		
	}
	public static void letterAlphabetQ() {
		int i,j;
		for(i=0;i<=7;i++) {
			for(j=0;j<=7;j++) {
				if(((i>=1 && i<=5)&&(j==0 || j==7))||((i==0)&&(j>0 && j<7)) || ((i>3) &&j==i+0) ||(i==6 && (j>=1 && j<=4))|| (i==5 && j==0)) {
					System.out.print("Q");
				}
				
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

		
	}

	


