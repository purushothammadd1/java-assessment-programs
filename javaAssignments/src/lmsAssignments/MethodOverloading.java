package lmsAssignments;

public class MethodOverloading {
	static int average(int n1,int n2) {
		System.out.println("Run version 1");
		return (n1+n2)/2;
	}
	static double average(double n1,double n2) {
		System.out.println("Run version 2");
		return (n1+n2)/2;
	}
	static int average(int n1,int n2,int n3) {
		System.out.println("run version 3");
		return (n1+n2+n3)/3;
	}
	public static void main(String[] args) {
		System.out.println(average(1,2));//run version 1 //1
		System.out.println(average(1.0,2.0));//1.5
		System.out.println(average(1,2,5));//2
		System.out.println(average(1.0,3));//implicitly casted to double 2.0
//		 System.out.println(average(1,3,4,6));//The method average(int, int, int) in the type MethodOverloading is not applicable for the arguments (int, int, double, int)

	}
}
