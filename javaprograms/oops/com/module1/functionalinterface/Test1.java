package com.module1.functionalinterface;

public class Test1 {
	public static void m1() {
		for(int i=1;i<=10;i++) {
			System.out.println("child thread");
		}
	}
	
	public static void main(String[] args) throws Exception {
		Runnable r =Test1::m1;
		
		Thread t=new Thread(r);
		t.start();
		
		for(int i=1;i<=10;i++) {
			System.out.println("main thread");
			Thread.sleep(1000);
		}
	}

}
