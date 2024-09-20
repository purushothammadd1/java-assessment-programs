package practice;

import java.util.Scanner;

public class ProjectAlphabets {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur choice:");
		char ch=sc.next().charAt(0);
		//String c=name.toLowerCase();
		switch(ch) {
		case 'O':
			letterAlphabetO();
			break;
		case 'P':
			letterAlphabetP();
			break;
		case 'Q':
			letterAlphabetQ();
			break;
		default:
			System.out.println("Entet valid Inputs");
			
		}
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