package basics;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Body mass Index(BMI)
		Scanner bi = new Scanner(System.in);
		System.out.println("weight in kg:");
		float weight =bi.nextFloat();
		System.out.println("Height in meters:");
		float height =bi.nextFloat();
		float BMI=weight/(height*height);
		System.out.println("The Ouput of BMI:"+BMI);

	}

}
