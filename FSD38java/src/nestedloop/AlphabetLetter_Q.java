package nestedloop;

public class AlphabetLetter_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alphabetLetter(7);

	}

	public static void alphabetLetter(int n) {
		// TODO Auto-generated method stub
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
