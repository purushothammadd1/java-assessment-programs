package com.module1.java.interviewsquestions;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDulipcatesfromArray {
	//[1,2,3,1,2,4,5]
	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<>(Arrays.asList(1,10,1,2,2,3,3,10,4,3,5,5));
		System.out.println("ArrayList with duplicate "+ list);
		ArrayList<Integer> newList =removeDuplicates(list);
		System.out.println("ArrayList with duplicates "+newList);


	}
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
		// TODO Auto-generated method stub
		ArrayList<T> newList = new ArrayList<T>();
		for(T element : list) {
			if(!newList.contains(element)) {
				newList.add(element);
			}
		}
		return newList;
	}

}
