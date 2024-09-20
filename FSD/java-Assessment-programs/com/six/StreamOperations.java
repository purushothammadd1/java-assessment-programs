package com.six;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamOperations {
	public static void main(String[] args) {
		// Create a large data set (for demo purposes, we'll use random integers)
		List<Integer> largeDataSet= new Random().ints(1000, 1, 10000)
				.boxed()
				.collect(Collectors.toList());
		 // Print the original data size
		System.out.println("Original data set size: "+ largeDataSet.size());
		
		//1.Filter the data to include only even numbers
		List<Integer> filteredData = largeDataSet.stream()
				.filter(num -> num % 2 == 0)
				.collect(Collectors.toList());
		
		//print the size of the filtered data set
		System.out.println("Filtered data set size (only even numbers): "+ filteredData.size());
		
		//2.sort the filtered data in ascending order
		List<Integer> sortedData = filteredData.stream()
				.sorted()
				.collect(Collectors.toList());
		
		//print first 10 numbers after sorting for demonstration
		System.out.println("First 10 numbers after sorting: "+ sortedData.stream().limit(10).collect(Collectors.toList()));
	}

}
