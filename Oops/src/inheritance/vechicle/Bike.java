package inheritance.vechicle;

public class Bike extends Vechicle{
	private String EngineCC;
	private int speed;
	private int gear;
	public Bike() {
		
	}
	public Bike(String brand,String model,String registration,String engineCC, int speed, int gear) {
		super(brand,model,registration);
		this.EngineCC = engineCC;
		this.speed = speed;
		this.gear = gear;
	}
	public String getEngineCC() {
		return EngineCC;
	}
	public void setEngineCC(String engineCC) {
		EngineCC = engineCC;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public void followSafety() {
		System.out.println("Please follow the Traffic rules and wear helment");
	}
	public void followDrive() {
		System.out.println("Dont drive overspeed on roads");
	}
	
	public String toString() {
		return super.toString()+" \nEngineCC=" + EngineCC + " \nspeed=" + speed + "\n gear=" + gear ;
	}
	
}
