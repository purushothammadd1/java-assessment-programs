package inheritance.vechicle;

import java.util.Scanner;

public class AutoMobile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		Car c1=new Car();
		Car c1=new Car("Audi","A6","TS08","Auto","In line petrol Engine",7,5);
		System.out.println(c1);
		c1.followSafety();
		c1.followDrive();
		System.out.println("=======================");
		Bike b1=new Bike("Triumph","Tiger","TS27","660cc",120,6);
		System.out.println(b1);
		b1.followSafety();
		b1.followDrive();

	}

}
//method overiding :the method should be same 