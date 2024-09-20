package com.oops.PaymentSystem;

public class CreditCard extends Card implements PaymentMethod{

	public CreditCard(String no, String name) {
		super(no, name);
		
	}

	@Override
	public void pay() {
		System.out.println("Paying via credit card");
	}

}
