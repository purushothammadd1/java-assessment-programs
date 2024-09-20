package com.collections;

import java.util.*;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList num1=new ArrayList();
//		System.out.println(num1.isEmpty());//true
		num1.add(12);
		num1.add(23);
		num1.add(45);
		num1.add(34);
		
//		num1.add("java");
		System.out.println(num1);//[12,23,45,34,java]
//		System.out.println(num1.clone());//shallow copy (print the array in same arraylist)
//		System.out.println(num1.containsAll(num1));//true
//		System.out.println(num1.sort());
		ArrayList<Integer> num=new ArrayList<Integer>();
		
		num.add(12);
		num.add(23);
		num.add(45);
		num.add(34);
		num.add(34);
		
//		num.add("java");//The method add(Integer) in the type ArrayList<Integer> is not applicable for the arguments (String)
		
		System.out.println(num);//[12,23,45,34,34]
		System.out.println(num.get(2));//45
		System.out.println(num1);


		
		//LinkedList 
		LinkedList<Integer> link1=new LinkedList<Integer>();
		link1.add(2);
		link1.add(4);
		link1.add(76);
		link1.add(45);
		link1.add(24);
		link1.add(34);
		System.out.println(link1.removeLastOccurrence(link1));//false
		System.out.println(link1);
//		System.out.println(link1.addAll(link1));//true
		System.out.println(link1.size());//6
//		System.out.println(link1.removeLastOccurrence(link1));//false
		System.out.println(link1);//[2,4,76,45,24,34]
		System.out.println(link1.size());//6
		
		
		//
	}

}
