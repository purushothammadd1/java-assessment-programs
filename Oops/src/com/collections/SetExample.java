package com.collections;

import java.util.*;

public class SetExample {
	public static void main(String[] args) {
		HashSet<Integer> num=new HashSet<Integer>();
		num.add(23);
		num.add(67);
		num.add(45);
		num.add(34);
		num.add(32);
//		System.out.println(num);
//		System.out.println(num.size());
//		
//		
		System.out.println();
		HashSet<Float> fSet=new HashSet<Float>();
		fSet.add(3.4f);
		fSet.add(4.1f);
		fSet.add(5.3f);
		fSet.add(2.3f);
		
		Iterator<Float> fHsItr=fSet.iterator();
		System.out.println(fSet.size());//4
		while(fHsItr.hasNext()) {
			
			System.out.println(fHsItr.next());
			fHsItr.remove();
		}
		System.out.println(fSet.size());
//		System.out.println(fHsItr.next());
//		System.out.println(fSet.remove(4.1));
//		System.out.println(fHsItr);
//		System.out.println(fHsItr.remove());
//		System.out.println(fHsItr.hasNext());
//		System.out.println(fHsItr.next());
//		System.out.println(fHsItr.hasNext());
//		System.out.println(fHsItr.next());
//		System.out.println(fHsItr.hasNext());
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(12);
		set.add(56);
		set.add(45);
		set.add(76);
		set.add(78);
		set.add(2);
//		System.out.println(set);
		TreeSet<String> set1=new TreeSet<String>();
		set1.add("java");
		set1.add("object");
		set1.add("oriented");
		set1.add("program");
//		System.out.println(set1);
//		System.out.println(set1.ceiling("java"));
//		System.out.println(set1);
	}
}
