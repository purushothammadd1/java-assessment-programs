package basics;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Convert celcius to Farhenhit Temperature
		//formula:-fh=celsius*
		Scanner Temp=new Scanner(System.in);
		System.out.println("Enter the celcius value: ");
		float Farhenhit,Celi=Temp.nextFloat();
		Farhenhit=((Celi*9)/5)+32;
		System.out.println("Temperature:" +  Farhenhit);
		
	}

}
