package com.module1.java;

import java.util.HashSet;
import java.util.Set;

public class ListElementSetInterface {
	
	public static void main(String[] args) {
		printElements();
	}

	private static void printElements() {
		// TODO Auto-generated method stub
		Set<String> element1 =new HashSet<>();
		element1.add("Laptop");
		element1.add("Mobiles");
		element1.add("TV");
		for(String element:element1) {
			System.out.println(element);
		}
		
	}
}
