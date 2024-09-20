package lmsAssignments;

import java.util.*;
//import java.util.List;

public class Collection {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> coffeelst=new ArrayList<String>();
		coffeelst.add("espresso");
		coffeelst.add("latte");
		coffeelst.add("cappuccino");
//		System.out.println(coffeelst);
		Iterator<String> iter =coffeelst.iterator();
		while(iter.hasNext());
		String str =iter.next();
		System.out.println(str);
		
		for(String str1: coffeelst)
			System.out.println(str1.toUpperCase());
		
	}

}
