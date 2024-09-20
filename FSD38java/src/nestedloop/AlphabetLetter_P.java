package nestedloop;

public class AlphabetLetter_P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alphabetPattern(7);

	}

	public static void alphabetPattern(int n) {
		// TODO Auto-generated method stub
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

}
