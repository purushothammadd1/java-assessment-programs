package com.five.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Product> cartItems;
	
	public ShoppingCart() {
		cartItems=new ArrayList<>();
	}
	//Add product to the cart
	public void addProduct(Product product) {
		cartItems.add(product);
		product.reduceStock();
		System.out.println(product.getName()+" added to the cart.");
	}
	
	//remove product from the cart by product ID
	public void removeProduct(int productId) {
		Product productToRemove = null;
		for(Product product: cartItems) {
			if(product.getId() == productId) {
				productToRemove = product;
				break;
			}
		}
		if(productToRemove != null) {
			cartItems.remove(productToRemove);
			System.out.println(productToRemove.getName()+" removed from the cart.");
		}else {
			System.out.println("Product not found in the cart.");
		}
	}
	//view items in the cart
	public void viewCart() {
		if(cartItems.isEmpty()) {
			System.out.println("Your Cart is empty.");
		}else {
			System.out.println("\nItems in Your Cart: ");
			for(Product product:cartItems) {
				System.out.println(product);
			}
		}
	}
	//calculate the total price of Items in the cart
	public double calculateTotal() {
		double total=0.0;
		for(Product product: cartItems) {
			total += product.getPrice();
		}
		return total;
	}
}
