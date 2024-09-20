package com.oops.PaymentSystem;

public class Test {
	public static void main(String[] args) {
		PaymentService ps =new PaymentService();
		ps.addPaymentMethod("PurushothamIOB", new DebitCard("1101", "Purushotham Maddi", 12345));
		ps.addPaymentMethod("PurushothamCreditCard", new CreditCard("1102", "purushotham maddi"));
		ps.addPaymentMethod("purushotham27UPI", new UPI("purushotham27", 123));
		ps.makePayment("purushothamCreditCard");
//		ps.makePayment("purushotham27UPI");
	}

}
