package com.module1.annotations;

import java.util.ArrayList;
import java.util.List;

public class Log {
	public static void printLogValues(List<Integer>... logNumbersList) {
		Object[] objectlist =logNumbersList;
		List<String> stringValuesList = new ArrayList<>();
		stringValuesList.add("Hello");
		objectlist[0]=stringValuesList;
	}

}
