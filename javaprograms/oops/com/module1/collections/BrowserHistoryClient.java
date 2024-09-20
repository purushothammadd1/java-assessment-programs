package com.module1.collections;

public class BrowserHistoryClient {
	public static void main(String[] args) {
		BrowserHistoryV2 history = new BrowserHistoryV2();
		history.push("instagram.com");
		history.push("Linkedin.com");
		history.push("google.com");
		history.pop();
		history.push("chat.openai.com");
		
		Iterator it = history.iterator();
		while(it.hasNext()) {
			System.out.println(it.current());
			it.next();
		}
	}

}
