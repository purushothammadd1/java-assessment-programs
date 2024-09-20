package polymorphism;

public class MethodoverLoding {
	public void getSum(int a,int b) {
		System.out.println("Addition of two numbers:"+(a+b));
	}
	public void getSum(float a,int b) {
		System.out.println("Addition of two number:"+(a+b));
	}
	public static void main(String[] args) {
		MethodoverLoding o1=new MethodoverLoding();
	}
	}


//Staic keyword:ste of variables and methods and blocks 
//