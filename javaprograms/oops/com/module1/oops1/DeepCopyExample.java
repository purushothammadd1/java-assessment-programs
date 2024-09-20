package com.module1.oops1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeepCopyExample {
	int data;
	List<Integer> list;
	public DeepCopyExample(int data,List<Integer> list) {
		this.data=data;
		this.list=new ArrayList<>(list);
	}
	public String toString() {
		return "ShallowCopyExample{" +
				"data="+ data +
				", list=" + list +
				'}';
	}
	public static void main(String[] args) {
		List<Integer> list =new ArrayList<>(Arrays.asList(1,3,5,7));
		DeepCopyExample deepCopyExample = new DeepCopyExample(5, list);
		
		list.add(9);
		System.out.println(list);
		System.out.println(deepCopyExample);
	}
}