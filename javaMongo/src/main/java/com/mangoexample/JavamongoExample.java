package com.mangoexample;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

public class JavamongoExample {
	public static void main(String[] args) {

		//creating a mongodb client
		try(MongoClient mongoClient = new MongoClient("localhost",27017)){
			//creating credentials
//			MongoCredential mongoCredential =MongoCredential.createCredential("root", "order", 4724);
		}
		
		System.out.println("Created mongo connection successfully");
	}

}
