package com.cn.basics;

public class RelationalLogical {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println(true && true);//true
		System.out.println( true && false);//false
		System.out.println(false && true);//false
		System.out.println(false && false);//false
		System.out.println(true || true);//false
		System.out.println( true || false);//true
		System.out.println(false || true);//true
		System.out.println(false || false);//false
		System.out.println(a>10 && b>10);//false
		System.out.println(a>=10||b<=10);//true
		//                   true  || false  
	}

}
