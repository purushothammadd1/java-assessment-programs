package com.five.ecommerce;

public class Inventory {
	private int stock;
	
	public Inventory(int stock) {
		this.stock=stock;
	}
	public int getStock() {
		return stock;
	}
	public boolean isAvailable() {
		return stock > 0;
	}
	public void reduceStock(int quantity) {
		if(quantity <= stock) {
			stock -= quantity;
		}
	}
}
