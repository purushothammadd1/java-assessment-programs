package com.basics.Numbers;
import java.io.*;
import java.util.*;


public class Solution {



	static int computeVal(String s){
		int val = 0;
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'
					||
					ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
				val++;
		}
		return val;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the t value:");
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
			int n = sc.nextInt();
			String ans = "";
			int max = 0;
			for(int j=0;j<n;j++){
				String s = sc.next();
				int val = computeVal(s);
				if(val>max){
					max = val;
					ans = s;
				}
			}
			System.out.println(ans);
		}
	}
}


