package com.collections;
import java.util.ArrayList;
import java.util.List;
public class ListDemo1 {
	public static void main(String[] args) {
		List<String> name=new ArrayList<String>();
		name.add("purushotham");
		name.add("nagaraju");
		name.add("umarani");
		name.add("navya");
		name.add("nandini");
		name.add("sampath");
		for(String Family:name)
			System.out.println(Family);
		
	}

}
/*
 * List inteface:List is a java collection that can duplicate elements stored in it.
 * It is an ordered collection and that contains duplicate elements .
 * THat elements from its index the list is more likely an array with dynamic length the list is one of the most used collection types 
 * an arraylist and linkedlist are the implementaions classes of the list interface.
 * The list interface provides useful methods to add an element at a specific index to removeand replace elements based on the 
 * index and to get a sub list using the index.*/
