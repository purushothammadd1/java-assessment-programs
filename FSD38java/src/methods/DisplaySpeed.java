package methods;

import java.util.Scanner;

public class DisplaySpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Input Distance in meters:");
		float timeSeconds;
		float mps,kph,mph;
		
		float distance=sc.nextFloat();
		System.out.println("Input Hour:");
		float hr =sc.nextFloat();
		System.out.println("INput Minutes:");
		float min=sc.nextFloat();
		System.out.println("Input Seconds:");
		float sec=sc.nextFloat();
		timeSeconds =(hr*3600)+(min*60)+sec;
		mps=distance/timeSeconds;
		kph=(distance/1000.0f)/(timeSeconds/3600.0f);
		mph=kph/1.609f;
		System.out.println("Your speed in meters per seconds is" +mps);
		System.out.println("your speed in kilometer per hour is" +kph);
		System.out.println("your speed in miles per hour is " +mph);

	}

}
