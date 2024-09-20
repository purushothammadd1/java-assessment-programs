package com.collections;

import java.util.*;

public class List {
	public static void main(String[] args) {
		ArrayList<Integer> intList=new ArrayList<Integer>();
		LinkedList l1=new LinkedList();
		l1.add(45);
		l1.add(23);
		l1.add(34);
		l1.add(12);
		l1.add(56);
		System.out.println(l1);
//		Collections.sort(l1);
		Iterator it=l1.iterator();
		
	}
	
}

