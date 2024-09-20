package animalprogram;

public class Dog<another> extends Mammal {
	public Dog(String name) {
		super(name);
		
	}

	public void greets() {
		System.out.println("woof");
	}
	
	public void greets(another Dog) {
		System.out.println("wooooof");
	}
	public String toString() {
		return "Mammal["+super.toString()+"]";
	}
	

}
