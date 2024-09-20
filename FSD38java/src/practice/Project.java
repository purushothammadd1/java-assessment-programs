package practice;

import java.util.Scanner;

public class Project {
	public class StringArrayPrint {
		static Scanner sc= new Scanner(System.in);
		static String name= sc.nextLine();
		static int n= name.length();
		static int count=0;
		static int colum=0;
		static int col=9;
		static int row=8;
		static String[][] namespace = new String[row][col*n];

		public static void main(String[] args) {
			eachChar(name);
		}

		private static void printNum(String[][] letter) {
			for(int i=1;i<row;i++) {
				for(int j=1;j<col;j++) {
					namespace[i][j+colum]= letter[i][j]; 
				}	
			}
			if(count==n-1) {
				for(int i=1;i<namespace.length;i++) {
					for(int j=1;j<col*n-n+1;j++) {
						if(namespace[i][j]==null) {
							namespace[i][j]="   ";
						}
						System.out.print(namespace[i][j]);
					}
					System.out.println();	
				}	
			}
			count++;
			colum+=8;
		}

		public static void eachChar(String name) {

			for(int i=0;i<name.length();i++) {

				checkNum(name.charAt(i));

			}
		}

		public static void checkNum(char object) {
			switch(object) {
			case('A'):
				printNum(letter_A());
			break;
			case('B'):
				printNum(letter_B());
			break;
			case('C'):
				printNum(letter_C());
			break;	
			case('D'):
				printNum(letter_D());
			break;	
			case('E'):
				printNum(letter_E());
			break;	
			case('F'):
				printNum(letter_F());
			break;	
			case('G'):
				printNum(letter_G());
			break;	
			case('H'):
				printNum(letter_H());
			break;	
			case('I'):
				printNum(letter_I());
			break;	
			case(' '):
				printNum(letter_());
			break;	
			case('L'):
				printNum(letter_L());
			break;	
			case('M'):
				printNum(letter_M());
			break;	
			case('N'):
				printNum(letter_N());
			break;
			case('O'):
				printNum(letter_O());
			break;
			case('P'):
				printNum(letter_P());
			break;
			case('Q'):
				printNum(letter_Q());
			break;
			case('S'):
				printNum(letter_S());
			break;	
			case('T'):
				printNum(letter_T());
			case('R'):
				printNum(letter_R());
			break;	
			case('W'):
				printNum(letter_W());
			break;	
			case('X'):
				printNum(letter_X());
			break;	
			case('Y'):
				printNum(letter_Y());
			break;	
			case('Z'):
				printNum(letter_Z());
			break;	


			}
		}

		public static String[][] letter_A() {
			String[][] arr=new String[8][9];
			for(int i = 1; i <= 7;i++) {
				for(int j = 1; j <= 7;j++) {
					if(j==8) {
						arr[i][j]="  ";
					}
					else if((i != 1 && (j == 1  || j == 7)) ||(i == 1 && j % 2 == 0) ||(i == 4 && j % 2 != 0) ) {
						arr[i][j]="A";
					}
					else {
						arr[i][j]="  ";
					}
				}
			}
			return arr;
		}

		public static String[][] letter_B() {
			String[][] arr=new String[8][9];
			for(int i = 1; i <= 7;i++) {
				for(int j = 1; j <= 7;j++) {
					if(((i==1||i==4||i==7)&&j!=7)||((j==7)&&(i==2||i==3||i==5||i==6)||(j==1)) ) {
						arr[i][j]="B";
					}
					else {
						arr[i][j]="  ";
					}
				}
			}
			return arr;
		}

		public static String[][] letter_C() {
			String[][] arr=new String[8][9];
			for(int i =1;i<=7;i++) {
				for(int j=1;j<=7;j++) {
					if(((i==1||i==7)&&(j!=1&&j!=7))||(j==1&&(i!=1&&i!=7))||(j==7&&(i==2||i==6))) {
						arr[i][j]="C";
					}
					else {
						arr[i][j]="  ";
					}
				}
			}
			return arr;
		}

		public static String[][] letter_D() {
			String[][] arr=new String[8][9];
			for(int i =1;i<=7;i++) {
				for(int j=1;j<=7;j++) {
					if(((i==1||i==7)&&(j!=7))||(j==1)||(j==7&&(i!=1&&i!=7))) {
						arr[i][j]="D";
					}
					else {
						arr[i][j]="   ";
					}
				}
			}
			return arr;
		}

		public static String[][] letter_E() {
			String[][] arr=new String[8][9];
			for(int i =1;i<=7;i++) {
				for(int j=1;j<=7;j++) {
					if((j==1)||(i==1||i==7)||(i==4&&j!=7)) {
						arr[i][j]="E";
					}
					else {
						arr[i][j]="  ";
					}
				}
			}
			return arr;
		}

		public static String[][] letter_F() {
			String[][] arr=new String[8][9];
			for(int i = 1; i <= 7;i++) {
				for(int j = 1; j <= 7;j++) {
					if(((j == 1  || j == 7%2)) ||(i == 1 ) ||(i == 4 && j /2 !=7) && (i == 4 && j %10 !=7) ) {
						arr[i][j]="F";
					}else {
						arr[i][j]="  ";
					}
				}
			}
			return arr;
		}

		public static String[][] letter_G() {
			String[][] arr=new String[8][9];
			for(int i = 1; i <= 7;i++) {
				for(int j = 1; j <= 7;j++) {
					if ((i == 1 && (j>1 && j!=7)) || (i==7 && (j>1 && j!=5 && j!=6 ))||(i!=1 && i!=7 && j==1||(i==4 && j!=2) || (i==5 && (j==5 || j==7)) || (i==2 && j==7) || (i==6 && (j==5 || j==7) ))) { 
						arr[i][j]="G";
					}
					else {
						arr[i][j]="  ";
					}
				}
			}
			return arr;
		}

		public  static String[][]  letter_H(){
			String[][] arr=new String[8][9];
			for(int i = 1; i <= 7;i++) {
				for(int j = 1; j <= 7;j++) {
					if((i!=0)&& (j == 1 || j==7) ||(i ==1 && j%2==2) ||(i == 4 && j%2!=6) ) {
						arr[i][j]="H";
					}
					else {
						arr[i][j]="  ";
					}
				}
			}
			return arr;
		}

		public static  String[][]  letter_I() {
			String[][] arr=new String[8][9];
			for(int i = 1; i <= 7;i++) {
				for(int j = 1; j <= 7;j++) {
					if((j!=0)&& (i == 1 || i==7) ||(j ==1 && i%2==2) ||(j == 4 && i%2!=6) ) {
						arr[i][j]="I";
					}
					else {
						arr[i][j]="  ";
					}
				}
			}
			return arr;
		}

		public static String[][] letter_() {
			String[][] arr=new String[8][9];
			for(int i =1;i<=7;i++) {
				for(int j=1;j<=7;j++) {
					arr[i][j]="  ";
				}
			}
			return arr;
		}

		public static String[][] letter_L() {
			String[][] arr=new String [8][9];
			for(int i = 1; i <= 7;i++) {
				for(int j = 1; j <= 7;j++) {
					if((i >=7  || j ==1)) {
						arr[i][j]=" L";
					}else {
						arr[i][j]="  ";
					}	
				}	
			}
			return arr;
		}

		public static String[][] letter_M() {
			String[][] arr=new String [8][9];
			for(int i=1;i<=7;i++) {
				for(int j=1;j<=7;j++) {
					if(((j==1 ) || (j==7)) || 
							(i==1 && (j==2 || j==6)) ||
							((i==2 &&(j==3 || j==5))) ||
							(j==4&&(i==3 || i==4))) {	
						arr[i][j]="M";				
					}else {
						arr[i][j]="  ";
					}	
				}	
			}
			return arr;
		}

		public static String[][] letter_N() {
			String[][] arr=new String [8][9];
			for(int i=1;i<=7;i++) {
				for(int j=1;j<=7;j++) {
					if(((j==1) || (j==7)) || (i==j &&(i!=3|| i==3))){
						arr[i][j]="N";
					}else {
						arr[i][j]="  ";
					}
				}	
			}
			return arr;
		}

		public static String[][] letter_O() {

			String[][] arr=new String [7][8];
			for(int i=0;i <=6;i++) {
				for (int j=0;j <=6 ;j++) {

					if(((i>=1 && i <6) && (j==0 || j==6)) || ((i==0 || i==6) && (j>0 &&j<6)))  {
						arr[i][j]="O";
					}else{
						arr[i][j]="  ";
					}

				}
			}
			return arr;
		}

		public static String[][] letter_P() {
			String[][] arr=new String [8][9];
			for(int i=0;i<7;i++) {
				for(int j=0;j<7;j++) {
					if(((i==0 || i==3) && (j<6))||(i>0 &&  i<3)&&(j==0 || j==6)||(i>3 && j==0)) {
						arr[i][j]="P";
					}else {
						arr[i][j]="  ";
					}
				}

			}
			return arr;
		}

		public static String[][] letter_Q() {
			String[][] arr=new String [8][9];

			for(int i=0;i<=7;i++) {
				for(int j=0;j<=7;j++) {
					if(((i>=1 && i<=5)&&(j==0 || j==7))||((i==0)&&(j>0 && j<7)) || ((i>3) &&j==i+0) ||(i==6 && (j>=1 && j<=4))|| (i==5 && j==0)) {
						arr[i][j]="Q";
					}

					else {
						arr[i][j]=" ";
					}
				}	
			}
			return arr;
		}		

		public static String[][] letter_S() {
			String[][] arr= new String[8][9];

			for (int r=1;r<=7;r++) {

				for(int c=1;c<=7;c++) {

					if(r==1&&c>1&&c<7||(r==4&&c>1&&c<7)||(r==7&&c>1&&c<7)||(r==6&&c==1)||(r==2&&c==7)||(c==1&&r>1&&r<4)||(c==7&&r>4&&r<7)) {
						arr[r][c]="S";
					}else {
						arr[r][c]="  ";
					}
				}
			}
			return arr;
		}

		public static String[][] letter_T() {
			String[][] arr= new String[8][9];
			for (int r=1;r<=7;r++) {
				for(int c=1;c<=7;c++) {
					if(r==1||c==4||(r==2&&c==1)||(r==2&&c==7)) {
						arr[r][c]="T";
					}
					else {
						arr[r][c]="  ";
					}
				}
			}
			return arr;
		}

		public static String[][] letter_R() {
			String[][] arr=new String [8][9];
			for (int r=1;r<=7;r++) {
				for(int c=1;c<=7;c++) {
					if(r==1&&c>1&&c<7||r==4&&c>1&&c<7||r==2&&c==7||r==3&&c==7||c==1||((r==c&&(r==5||r==6||r==7)))) {
						arr[r][c]="R";
					}	
					else {
						arr[r][c]="  ";
					}

				}
			}
			return arr;
		}

		public static String[][] letter_W(){
			String[][]arr=new String[8][9];
			for(int j=1;j<=6;j++) {
				for(int i=1;i<=7;i++) {
					if((j<3&&i==1)||(j<3&&i==7)||((j>2&&j<=4)&&(i==1||i==4)||(j>2&&j<=4)&&(i==7))||(j==5&&i%2!=0)||((j==6&&i==1)||(j==6&&i==7))) {
						arr[i][j]="W";
					}
					else {
						arr[i][j]="  ";
					}
				}

			}
			return arr;

		}

		public static String[][] letter_X(){
			String[][]arr=new String[8][9];
			for(int j=1;j<=6;j++) {
				for(int i=1;i<=6;i++) {
					if((j==1&&i==2)||(j==1&&i==6)||((j==2&&i==3)||(j==2&&i==5))||(j==3&&i==4)||(j==4&&i==3)||(j==4&&i==5)||(j==5&&i==2)||(j==5&&i==6)||(j==6&&i==2)||(j==6&&i==7)){
						arr[i][j]="X";
					}
					else {
						arr[i][j]="  ";
					}
				}

			}
			return arr;
		}

		public static String[][] letter_Y(){
			String[][]arr=new String[8][9];
			for(int i=1;i<=6;i++) {
				for(int j=1;j<=7;j++) {
					if((i==1&&j==3)||(i==1&&j==7)||(i==2&&j==4)||(i==2&&j==6)||((i>2&&i<=6)&&j==5)){
						System.out.print("Y");
					}


					else {
						arr[i][j]="  ";
					}
				}

			}
			return arr;		
		}

		public static String[][] letter_Z(){
			String[][]arr=new String[8][9];
			for(int i=1;i<=7;i++) {
				for(int j=1;j<=7;j++) {
					if((j==1&&i<=7)||(j==7&&i<=7)||(j>1&&j<7)&&(i==7-j+1)) {
						System.out.print("z");
					}
					else {
						arr[i][j]="  ";
					}
				}

			}
			return arr;
		}
	}
}


