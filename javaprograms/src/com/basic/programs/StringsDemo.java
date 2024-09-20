package com.basic.programs;

public class StringsDemo {
	public static void main(String[] args) {
		stringBuilderDemo();
		StringEqualMethod();
		stringBuilderEqualMethods();
		stringConstantPoolexample();
		stringCase4();
		stringCase5();
		stringCase6();
		stringCase7();
	}
	public static void stringCase7() {
/*
 * Interning: Using Heap object reference, if we want to get corresponding SCP object, then we need to use intern() method.*/
		String s1= new String("sachin");//one in heap(s1) and the other one is SCP
		String s2 = s1.intern(); //using s1 access object in SCP which has a no reference
//		System.out.println(s1==s2);//false
		String var="sachin";
		System.out.println(s2==var);//truec
	 }

	 public static void stringCase6() {
		String s1 = new String("you cannot change me!");
		String s2 = new String("you cannot change me!");
//		System.out.println(s1==s2);//false
		
		String s3="you cannot change me!";
//		System.out.println(s1==s3);//false
		
		String s4 ="you cannot change me!";
//		System.out.println(s3==s4);//true
		
		String s5="you cannot " + "change me!";
//		System.out.println(s3==s5);//true
		
		String s6="you cannot ";
		String s7=s6+"change me!";
//		System.out.println(s3==s7);//false
		
		final String s8="you cannot ";
		String s9 =s8+"change me!";
//		System.out.println(s3 == s9);//true
//		System.out.println(s6 == s8);//true
		
	}
	 

	public static void stringCase5() {
		String s1=new String("sachin");
		s1.concat("tendular");
		s1 += "IND";
		String s2 = new String("MI");
//		System.out.println(s1);
//		System.out.println(s2);
		
	}

	private static void stringCase4() {
		String s=new String("sachin");
		s.concat("tendulkar");
		s=s.concat("IND");
		s="sachintendulkar";
//		System.out.println(s);
		
	}

	private static void stringConstantPoolexample() {
		String s1=new String("dhoni");
		String s2 = new String("dhoni");
		String s3 = "dhoni";
		String s4 = "dhoni";
//		 System.out.println(s1==s2);
		
	}

	static void stringBuilderEqualMethods() {
		 StringBuilder sb1=new StringBuilder("sachin");
		 StringBuilder sb2=new StringBuilder("sachin");
//		 System.out.println(sb1==sb2);//false
//		 System.out.println(sb1.equals(sb2));
		
	}

	public static void StringEqualMethod() {
		String s1=new String("sachin");
		String s2 = new String("sachin");
//		System.out.println(s1 == s2);//false
//		System.out.println(s1.equals(s2));// true
		
	}

	public static void stringBuilderDemo() {
		StringBuilder sb=new StringBuilder("sachin");
		sb.append("tendular");
//		System.out.println(sb);
		
	}

}
