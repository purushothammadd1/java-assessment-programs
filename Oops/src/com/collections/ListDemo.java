package com.collections;

import java.util.*;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList aList =new ArrayList();
		aList.add(23);
		aList.add("java");
		aList.add('p');
		aList.add(1, "object");
		aList.add(2,"oriented");
		aList.add(3,"programming");
//		System.out.println(aList.get(2));
//		System.out.println(aList.isEmpty());
		System.out.println(aList);
		System.out.println(aList.size());
	}
}
