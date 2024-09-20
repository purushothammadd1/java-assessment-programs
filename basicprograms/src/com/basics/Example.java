package com.basics;

public class Example {
//	double STATIC=2.5;
	public static void main(String[] args) {
//		System.out.println("Hello",100);// error: we cannot give two data's in print statement
//	System.out.println(STATIC);
		Double object=new Double("2.4");
		int a=object.intValue();
		byte b=object.byteValue();
		float d=object.floatValue();
		double c=object.doubleValue();
		System.out.println(a+b+c+d);//8.800000095367432
		
	}

}
