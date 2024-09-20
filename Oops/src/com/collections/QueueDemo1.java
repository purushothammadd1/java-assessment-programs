package com.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo1 {
	public static void main(String[] args) {
		Queue<String> queue =new LinkedList<>();
		queue.add("Apple");
		queue.add("Mango");
		queue.add("Grapes");
		queue.add("Banana");
		queue.add("Swaberry");
		System.out.println(queue);
		
		queue.remove("Grapes");
		System.out.println(queue);
		System.out.println("Queue total size: "+queue.size());
		System.out.println("Queue includes friut 'Apple'? : "+queue.contains("Apple"));
		
		queue.clear();
	}

}
