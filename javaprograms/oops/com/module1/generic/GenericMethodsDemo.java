package com.module1.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodsDemo {
	public static <T> void doSomething(List<T> obj) {
		for(T item: obj) {
			System.out.println(item);
		}
	}
	public static void main(String[] args) {
		List<Integer> i = new ArrayList<>();
		i.add(10);
		i.add(35);
		i.add(45);
		
		List<String> l2= new ArrayList<>();
		l2.add("SaiPavan");
		l2.add("Harish");
		l2.add("purushotham");
		l2.add("SaiTeja");
//		doSomething(l2);
		
		List<Object> l3 = new ArrayList<>();
		l3.add(1);
		l2.add("Apple");
		l3.add(new User());
		doSomething(l3);
		
	}
}
