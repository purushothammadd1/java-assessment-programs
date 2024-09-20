package com.module1.functionalinterface;

@FunctionalInterface
public interface Bird {
	void canFly(String val);
//	void getHeight();
	default void getHeight() {
		
	}
	static void canFly() {
		
	}
//	Here Two abstract method is not possible in functional interface,but it can access a default and static methods in functional interface.
//	In Functional Interface takes only one abstract method signature

}
