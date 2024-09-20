package inheritance.vechicle;

public class Car extends Vechicle{
	private String type;
	private String Engine;
	private int gears;
	private int seat;
	
	
	public Car() {
		
	}
	public Car(String brand,String model,String registration,String type,String Engine,int gears,int seat) {
		super(brand,model,registration);
		this.type=type;
		this.Engine=Engine;
		this.gears=gears;
		this.seat=seat;
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type=type;
	}
	public String getEngine() {
		return Engine;
	}
	public void setEngineNo(String Engine) {
		this.Engine=Engine;
	}
	public int getGears() {
		return gears;
	}
	public void setGears(int gears) {
		this.gears=gears;
	}
	public int getseat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat=seat;
	}
	public void followSafety() {
		System.out.println("Please follow the Traffic rules,wear a seatbelts");
	}
	public void followDrive() {
		System.out.println("Dont drive overspeed on roads");
	}
	public String toString() {
		return super.toString()+" \nType of Car: "+type+" \nEngine Type: "+Engine+" \nGear"+gears+" \nNo of seats:"+seat;
	}

}
