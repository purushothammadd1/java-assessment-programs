package com.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {

	public static void main(String[] args) {
		int count[]= {21, 23, 43, 53, 22,65};
		Set<Integer> set =new HashSet<Integer>();
		for(int i=0;i<=5;i++) {
			set.add(count[i]);
		}
		System.out.println(set);
		
		TreeSet<Integer> sortedset =new TreeSet<Integer>(set);
		System.out.println("The sorted list is:");
		System.out.println(sortedset);
		
		System.out.println("First element of the set is :"+ (Integer) sortedset.first());
		System.out.println("last element of the set is:"+ (Integer) sortedset.last());
	}
}
/*Set Interface :- Set is a java collection that cannot Duplicate elements stored in it
 * General purpose set interface Hashset,Treeset,LinkedHashSet
 * The Set interface
*/
