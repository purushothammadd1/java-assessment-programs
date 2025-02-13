package com.Eight;

import java.util.ArrayList;
import java.util.List;

public class EvenOddThreadsWithCollections {
	
	static class EvenThread extends Thread{
		private List<Integer> evenNumbers;
		
		public EvenThread(List<Integer> evenNumbers) {
			this.evenNumbers=evenNumbers;
		}
		public void run() {
			System.out.println("Even Numbers: ");
			for(int num: evenNumbers) {
				System.out.println(num);
				try {
					Thread.sleep(500);
				}catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}
	static class OddThread extends Thread{
		private List<Integer> oddNumbers;
		
		public OddThread(List<Integer> oddNumbers) {
			this.oddNumbers=oddNumbers;
		}
		public void run() {
			System.out.println("Odd Numbers: ");
			for(int num: oddNumbers) {
				System.out.println(num);
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		List<Integer> evenNumbers = new ArrayList<>();
		List<Integer> oddNumbers = new ArrayList<>();
		
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				evenNumbers.add(i);
			}else {
				oddNumbers.add(i);
			}
		}
		
		EvenThread evenThread = new EvenThread(evenNumbers);
		OddThread oddThread = new OddThread(oddNumbers);
		
		evenThread.start();
		oddThread.start();
		
		try {
			evenThread.join();
			oddThread.join();
		}catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Both threads finished execution.");
	}
}
