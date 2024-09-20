package com.five.ecommerce;

public class Product {
	
	private int id;
	private String name;
	private double price;
	private Inventory inventory;
	
	public Product(int id, String name, double price,int stock) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.inventory=new Inventory(stock);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isAvailable() {
        return inventory.isAvailable();
    }

    public void reduceStock() {
        inventory.reduceStock(1);
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Price: $" + price + " | Stock: " + inventory.getStock();
    }

}
