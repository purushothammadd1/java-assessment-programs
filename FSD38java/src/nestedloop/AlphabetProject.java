package nestedloop;

public class AlphabetProject {

	public static void main(String[] args) {
//		System.out.println(pattern_O());
		String arr[][]=pattern_O();
		int rn=arr.length;
		int ln=arr[0].length;
		for(int i=0;i<rn;i++) {
			for(int j=0;j<ln;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		pattern_P();
		pattern_Q();
	}

	public static String[][] pattern_O() {
		String [][] arr=new String[7][7];
		for(int i=0;i <=6;i++) {
			for (int j=0;j <=6 ;j++) {

				if(((i>=1 && i <6) && (j==0 || j==6)) || ((i==0 || i==6) && (j>0 &&j<6))) {
					arr[i][j]="O";
				}
				else {
					arr[i][j]=" ";
				}
			}
		}

		return arr;
	}
	public static String[][] pattern_P(){
		String [][] arr=new String[8][9];
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
				if(((i==0 || i==3) && (j<6))||(i>0 &&  i<3)&&(j==0 || j==6)||(i>3 && j==0)) {
					arr[i][j]="P";	
				}
				else {
					arr[i][j]="";
				}		
			}
		}
		return arr;
	}
	public static String[][] pattern_Q(){
		String[][] arr=new String[8][9];
		for(int i=0;i<=7;i++) {
			for(int j=0;j<=7;j++) {
				if(((i>=1 && i<=5)&&(j==0 || j==7))||((i==0)&&(j>0 && j<7)) || ((i>3) &&j==i+0) ||(i==6 && (j>=1 && j<=4))|| (i==5 && j==0)) {
					arr[i][j]="Q";
				}
				else {
					arr[i][j]="";
				}

			}
		}
		return arr;
	}
}