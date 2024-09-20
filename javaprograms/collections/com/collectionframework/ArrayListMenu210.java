package com.collectionframework;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMenu210 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> nums=new ArrayList<>();
		
		int tests=sc.nextInt();
		while(tests-- > 0) {
			int option=sc.nextInt();
			
			switch (option) {
			case 1: {
				
				System.out.println(nums.size());
				break;
			}
			case 2:{
				if(nums.size() == 0)
					System.out.println("invalid -move");
				else
					System.out.println(nums.remove(nums.size() - 1));
				break;
			}
			case 3:{
				//insert at last
				int x=sc.nextInt();
				nums.add(x);
				System.out.println(nums.get(nums.size() - 1));
				break;
				
			}
			case 4:{
				//remove first element
				if(nums.size()==0) {
					System.out.println("invalid-move");
				}else {
					System.out.println(nums.remove(0));
				}
				break;
				
			}
			case 5:{
				//insert at first
				int x=sc.nextInt();
				nums.add(0, x);
				System.out.println(nums.get(0));
				break;
			}
			case 6:{
				if(nums.size() == 0) {
					System.out.println("invalid-move");
				}else {
					for(int idx=0;idx<nums.size();idx++) {
						System.out.print(nums.get(idx)+" ");
					}
					System.out.println();
				}
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + option);
			}
		}
		
	}

}
