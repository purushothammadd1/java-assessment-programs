package animalprogram;
//any concrete subclass inherting from an abstract superclass
//must implement all inherited abstract methods
//impleming:-providing a method body{}
//if the subclass also implementing abstract methods not mandatory
public class Mammal extends Animal{
	public Mammal(String name) {
		super(name);
		
	}
	public void greets() {
		System.out.println("Meow");
	}
	public String toString() {
		return "Mammal["+super.toString()+"]";
	}
	
	public void living() {
		
	}

}
