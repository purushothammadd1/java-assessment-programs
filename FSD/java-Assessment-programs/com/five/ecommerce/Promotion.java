package com.five.ecommerce;

public class Promotion {
	private String promoCode;
	private double discountPercentage;
	
	public Promotion(String promoCode,double discountPercentage) {
		this.promoCode=promoCode;
		this.discountPercentage=discountPercentage;
	}
	public String getPromoCode() {
		return promoCode;
	}
	public double applyDiscount(double total) {
		return total - (total * discountPercentage / 100);
	}
}
