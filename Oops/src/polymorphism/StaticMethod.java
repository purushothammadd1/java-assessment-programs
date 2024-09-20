package polymorphism;

public class StaticMethod {
	public static void display() {
		System.out.println("Static method");
	}
	public void displayData() {
		System.out.println("Non-static method");
	}
	static {
		System.out.println("static block");
	}
	public static void main(String[] args) {
		display();
		StaticMethod s1=new StaticMethod();
		s1.displayData();
	}
	

}
