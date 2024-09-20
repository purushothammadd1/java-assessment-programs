package com.leetcode.interviewprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindRootNode {
	private static int findRootGraph(List<List<Integer>> nodes) {
		
//		Map<Integer, List<Integer>> parentChildRel = new HashMap<>();
//		Map<Integer, Integer> childParentRel = new HashMap<>();
//		Map<Integer, Boolean> nodeVisited = new HashMap<>();
//		Integer rootNode = -1;
//		
//		for(List<Integer> node: nodes) {
//			int nodeValue=node.get(0);
//			int nodeLeftValue =node.get(1);
//			int nodeRightValue = node.get(2);
//			
//			if(!parentChildRel.containsKey(nodeValue)) {
//				parentChildRel.put(nodeValue, new ArrayList<>());
//				nodeVisited.put(nodeValue, false);
//			}
//			if(nodeLeftValue != -1) {
//				
//				if(childParentRel.containsKey(nodeLeftValue)) {
//					return -1;
//				}
//				childParentRel.put(nodeLeftValue, nodeValue);
//				parentChildRel.get(nodeValue).add(nodeLeftValue);
//			}
//			
//			if(nodeRightValue != -1) {
//				if(childParentRel.containsKey(nodeRightValue)) {
//					return -1;
//				}
//				childParentRel.put(nodeRightValue, nodeValue);
//				parentChildRel.get(nodeValue).add(nodeRightValue);
//			}
//		}
//		
//		Set<Integer> childNodes= childParentRel.keySet();
//		Set<Integer> parentNodes = parentChildRel.keySet();
//		for(Integer childNode : childNodes) {
//			if(parentNodes.contains(childNodes)) {
//				continue;
//			}
//			return -1;
//		}
//	for(Integer parentNode: parentNodes) {
//		
//		if(childNodes.contains(parentNode)) {
//			continue;
//		}
//		if(rootNode == -1) {
//			rootNode = parentNode;
//		}else {
//			return -1;
//		}
//	}
//	
//	traverse(rootNode, nodeVisited, parentChildRel);
//	for(Map.Entry<Integer, Boolean> entrySet : nodeVistied.entrySet()) {
//		
//		Boolean isVisited = entrySet.getValue();
//		if(isVisited == false) {
//			return -1;
//		}
//	}
	return 0;
	}
	private static void traverse(Integer rootNode, Map<Integer, Boolean> nodeVisited, Map<Integer, List<Integer>> parentChildRel) {
//		if(nodeVisited.get(rootNode)) {
//			return;
//		}
//		
//		nodeVisited.put(rootNode, true);
//		for(Integer childNode : parentChildRel.get(rootNode)) {
//			traverse(childNode, nodeVisited, parentChildRel);
//		}
	}
	public static void main(String[] args) throws IOException {
//		BufferedReader bufferedReader=Files.newBufferedReader(Paths.get("/C:/Users/91970/Desktop/files/airbnb_input_failure.txt"));
//		
//		int nodesRows =Integer.parseInt(bufferedReader.readLine().trim());
//		int nodesColumns=Integer.parseInt(bufferedReader.readLine().trim());
//		
//		List<List<Integer>> nodes=new ArrayList<>();
//		
//		IntStream.range(0, nodesRows).forEach(i -> {
//			 try {
//	                nodes.add(
//	                        Stream.of(bufferedReader.readLine().replaceAll(",", " ").split(" "))
//	                                .map(Integer::parseInt)
//	                                .collect(toList())
//	                );
//	            } catch (IOException ex) {
//	                throw new RuntimeException(ex);
//	            }
//	        });
//
//		int result=findRootGraph(nodes);
//		System.out.println(result);
//		bufferedReader.close();
	}

	

	private static Collector toList() {
		// TODO Auto-generated method stub
		return null;
	}

}
