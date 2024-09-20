package com.module1.functionalinterface;

public class Test {
	public static void main(String[] args) {
		
		int[] arr = {0,5,10,15,20,25,30};
		Predicate2<Integer> p1=i -> i>10;
		System.out.println("Elements greater than 10 are ::");
		m1(p1,arr);
		Predicate2<Integer> p2 =i -> i%2 == 0;
		System.out.println("Elements which are even no ::");
		m1(p2,arr);
		System.out.println("Elements which are greater than 10 and should be even no");
//		m1(p1.and(p2),arr);
//		Predicate<String> p=name -> name.length() >= 3;
//		System.out.println(p.test("pwc"));
//		System.out.println(p.test("p"));
	}

	public static void m1(Predicate2<Integer> p, int[] arr) {
		for(int ele:arr) {
			if(p.test(ele))
				System.out.println(ele);
		}
		
	}

}
