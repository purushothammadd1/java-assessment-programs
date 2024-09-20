package com.five.ecommerce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ECommerceExample {
	private static HashMap<String, User> users= new HashMap<>();
	private static ShoppingCart cart= new ShoppingCart();
	private static Promotion promo = new Promotion("DISCOUNT10", 10.0);
	private static List<Product> products=new ArrayList<>();
	
	public static void main(String[] args) {
		//create some users
		users.put("john", new User("john","password123"));
		users.put("jane", new User("jane","password123"));
		
		//sample product catalog
		products.add(new Product(1,"Laptop",800.00,10));
		products.add(new Product(2,"Smartphone",500.00,5));
		products.add(new Product(3,"HeadPhones",50.00,20));
		products.add(new Product(4,"SmartWatch",150.00,8));
		
		Scanner sc=new Scanner(System.in);
		
		//user Authentication
		while(!Session.isAuthenticated()) {
			System.out.println("Enter your username: ");
			String username=sc.nextLine();
			System.out.println("Enter your password: ");
			String password=sc.nextLine();
			
			User user=users.get(username);
			if(user != null && user.validatepassword(password)) {
				Session.login(user);
			}else {
				System.out.println("Invalid credentials. please try again.");
			}
		}
		boolean exit =false;
		
		System.out.println("Welcome to the E-Commerce System!");
		while(!exit) {
			System.out.println("\nOptions:");
			System.out.println("1.View Product Catalog");
			System.out.println("2.Add Product to Cart");
//			System.out.println("3.Remove Product from cart");
			System.out.println("3.view Cart");
			System.out.println("4.checkout");
			System.out.println("5.Logout");
			System.out.println("Enter your choice: ");
			int choice=sc.nextInt();
			switch (choice) {
			case 1: 
				//view product catalog
				System.out.println("\nProduct Catalog:");
				for(Product product: products) {
					System.out.println(product);
				}
				break;
			case 2:
				//Add product to cart
				System.out.println("Enter the product ID to add to the cart: ");
				int addProductId=sc.nextInt();
				Product productToAdd = findProductById(products, addProductId);
				if(productToAdd != null && productToAdd.isAvailable()) {
					cart.addProduct(productToAdd);
				}else {
					System.out.println("Product is out of stock or does not exist.");
				}
				break;
//			case 3:
//				System.out.println("Enter the product ID to remove from the cart: ");
//				int removeProductId =sc.nextInt();
//				cart.removeProduct(removeProductId);
//				break;
			case 3:
				cart.viewCart();
				break;
			case 4:
				//checkout process
				double total=cart.calculateTotal();
				System.out.println("Total Price: $"+ total);
				System.out.println("Enter Promo code (or press Enter to skip): ");
				sc.nextLine(); //clear the buffer
				String enteredpromoCode =sc.nextLine();
				
				if(enteredpromoCode.equalsIgnoreCase(promo.getPromoCode())) {
					total = promo.applyDiscount(total);
					System.out.println("Promo code applied. Discounted total: $"+total);
				}
				System.out.println("Proceed to checkout? (yes/no): ");
				if(sc.nextLine().equalsIgnoreCase("yes")) {
					if(PaymentGateway.processPayment(total)) {
						System.out.println("checkout successful. Thank you for your purchase!");
						exit =true; // find the session after checkout
					}
				}
				break;
			case 5:
				//logout
				Session.logout();
				exit = true;
				System.out.println("Thank you for visting our store!");
				break;
			default:
				System.out.println("Invalid choice. please try again.");
			}		
		}
		sc.close();
	}
	//Helper method to find a product by its ID
	private static Product findProductById(List<Product> products, int id) {
		for(Product product: products) {
			if(product.getId() == id) {
				return product;
			}
		}
		return null;
	}

}
