package productdb;

public class Product {
	private int id;
	private String name;
	private double price;
	private Category category;

	public Product(int id,String name,double price,Category category) {
		this.id=id;
		this.name=name;
		this.price=price;
		this.category=category;
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
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String toString() {
		return "Product [product_id:"+id+",product_Name:"+name+", product_price:"+price+",category:"+category+"]";
	}

}
