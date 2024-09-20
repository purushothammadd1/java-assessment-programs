package com.module1.interfaceconcept;

public class Birds implements Bird,NonFlyingBirds{
	
	public static void main(String[] args) {
		System.out.println("hen is calling ");
	}
	@Override
	public void hen() {
		System.out.println("Cooku cooku");
		
	}
}
