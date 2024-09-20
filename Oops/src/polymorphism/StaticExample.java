package polymorphism;

import java.util.Scanner;

public class StaticExample {
	//	Scanner sc=new Scanner(System.in);

	 int a=1;
	static int b=1;

	public void display() {
		System.out.println("Value of a:"+ a++);
		System.out.println("Value of b:"+b++);
		System.out.println("=============================");
		System.out.println("Value of a:"+ a++);
		System.out.println("value of b:"+ b++);
	}
	public static void main(String[] args) {
		StaticExample d1=new StaticExample();
		d1.display();
		System.out.println("-----------------------------");
		StaticExample d2=new StaticExample();
		d2.display();
		System.out.println("-----------------------------");
		StaticExample d3=new StaticExample();
		d3.display();
		System.out.println("-----------------------------");
	}
}
