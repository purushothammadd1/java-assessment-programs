package nestedloop;

import java.util.Scanner;

public class Alphabet_LetterO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=8;
		alphabetLetter(6);

	}

	public static void alphabetLetter(int n) {

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
	

}
