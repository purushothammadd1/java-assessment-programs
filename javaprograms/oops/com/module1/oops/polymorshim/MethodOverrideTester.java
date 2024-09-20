package com.module1.oops.polymorshim;

public class MethodOverrideTester {
	public static void main(String[] args) {
		Parent p=new Parent();
		p.marry();
		Child c = new Child();
		c.marry();
		Parent p1= new Child();
		p1.marry();
	}

}
