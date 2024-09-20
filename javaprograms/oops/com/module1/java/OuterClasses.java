package com.module1.java;

class OuterClasses{
	int instanceVaribale =10;
	static int classVariable =20;
	public void display() {
		int methodLocalVariable =3;
		
		class LocalInnerClass{
			int localInnerVariable =4;
			public void print() {
				System.out.println(instanceVaribale+classVariable+methodLocalVariable+localInnerVariable);
			}
		}
		LocalInnerClass localObj = new LocalInnerClass();
		localObj.print();
	}
	
}