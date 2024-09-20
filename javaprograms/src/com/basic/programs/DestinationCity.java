package com.basic.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity {
	public static void main(String[] args) {
		List<List<String>> paths = new ArrayList<>();
		paths.add(Arrays.asList("London","New York"));
		paths.add(Arrays.asList("New York","Lima"));
		paths.add(Arrays.asList("Lima","Sao Paulo"));
		System.out.println(destCity(paths));
	}

	public static String destCity(List<List<String>> paths) {
		Set<String> destinations = new HashSet<>();
		Set<String> origins = new HashSet<>();
		for(List<String> path : paths) {
			destinations.add(path.get(1));
			origins.add(path.get(0));
		}
		for(String origin: origins) {
			if(!destinations.contains(origin)) {
				return origin;
			}
		}
		
		return "";
	}
}
