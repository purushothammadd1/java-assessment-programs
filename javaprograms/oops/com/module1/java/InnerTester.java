package com.module1.java;

public class InnerTester {
	public static void main(String[] args) {
		/*
		 * A a=new A(); A.B b = a.new B(); A.B.C c = b.new C(); c.m1();
		 */
	new A().new B().new C().m1();
	}

}
