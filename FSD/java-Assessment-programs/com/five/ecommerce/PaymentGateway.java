package com.five.ecommerce;

public class PaymentGateway {
	public static boolean processPayment(double amount) {
		System.out.println("Processing payment of $"+ amount+"...");
		//simulate successful payment
		System.out.println("payment sucessful!");
		return true;
	}
}
