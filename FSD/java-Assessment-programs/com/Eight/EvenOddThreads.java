package com.Eight;

public class EvenOddThreads {
	
	static class EvenThread extends Thread{
		public void run() {
			System.out.println("Even numbers: ");
			for(int i=2 ;i <= 10; i +=2) {
				System.out.println(i);
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	static class OddThread extends Thread{
		public void run() {
			System.out.println("Odd Numbers: ");
			for(int i=1; i<=10; i+=2) {
				System.out.println(i);
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		EvenThread evenThread=new EvenThread();
		OddThread oddThread = new OddThread();
		
		evenThread.start();
		oddThread.start();
		
		try {
			evenThread.join();
			oddThread.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Both threads finished execution.");
	}

}
