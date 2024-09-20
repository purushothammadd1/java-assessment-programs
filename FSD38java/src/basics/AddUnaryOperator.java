package basics;

public class AddUnaryOperator {
	public static void main(String args[]) {
		//perform the addition of unary operator
		int a=10;
		int b=5;
		
		System.out.println("post increment:" + a++ + a++ );
		System.out.println("pre decrement:" + --b + b++);
	}

}
