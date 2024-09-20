package com.module1.functionalinterface;

public class MyPredicate implements Predicate2<String>{

	@Override
	public boolean test(String name) {
		if(name.length() >= 3)
			return true;
		else
		    return false;
	}

	

}
