package animalprogram;

public abstract class Animal implements LivingBeing{
	private String name;
	
	
	public Animal(String name) {
		this.name=name;
	}
	public abstract void greets();
	public String toString() {
		return "Animal[name="+name+"]";
	}

}
