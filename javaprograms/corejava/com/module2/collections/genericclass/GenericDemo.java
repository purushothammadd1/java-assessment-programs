package com.module2.collections.genericclass;

import java.util.ArrayList;
import java.util.List;


public class GenericDemo {
	public static void main(String[] args) {
		List commonList = new ArrayList<>();
		
		commonList.add(1);
		commonList.add(2);
		
		for(Object o: commonList) {
			Integer i = (Integer) o;
			System.out.println(i);
		}
		
	}

}
