package com.collections;

import java.util.*;

public class CollectionEx1 {
	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(2);
		l1.add(12);
		System.out.println(l1.add(110));
		System.out.println("The ArrayLIst of elements:"+l1);
		LinkedList<Integer> l2=new LinkedList<Integer>();
		l2.add(56);
		l2.add(122);
		l2.add(34);
		l2.add(44);
		l2.add(11);
		l2.add(122);
		l2.add(550);
		System.out.println();
		System.out.println("The linked list values are "+l2);
		ArrayList<String> l3=new ArrayList<String>();
		l3.add("purushotham");
		l3.add("maddi");
		System.out.println();
		System.out.println("The ArrayList of String are "+l3);
		System.out.println(l3.size());
		System.out.println(l2.get(1));
//		String[] greeting= {"good morning"};
//		System.out.println(greeting.length);
	}
}
/*Collection: The collectionis a framework, 
 * and predefined Architecture
*/
