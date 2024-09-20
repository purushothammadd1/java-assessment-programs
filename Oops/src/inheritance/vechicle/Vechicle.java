package inheritance.vechicle;

public class Vechicle {
	private String brand;
	private String model;
	private String registration;
	
	public Vechicle() {
		
	}
	public Vechicle(String brand,String model,String registration) {
		this.brand=brand;
		this.model=model;
		this.registration=registration;
	}
	public String getBrand() {
		return brand;
		
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public String getRegistration() {
		return registration;
	}
	public void setRegistration(String registration) {
		this.registration=registration;
	}
	public void followSafety() {
		System.out.println("Please follow the Traffic rules");
	}
	public void followDrive() {
		System.out.println("Dont drive overspeed on roads");
	}
	public String toString() {
		return " Brand of Vechicle :" + brand+ " \nModel of Vechicle :"+model+" \nRegistration of vechicle:"+registration;
	}
	

}
