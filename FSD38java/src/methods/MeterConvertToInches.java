package methods;
import java.util.Scanner;

public class MeterConvertToInches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Inches:");
		int inch=sc.nextInt();
		System.out.println(inch + "In meters is "+ toInches(inch));

	}

	public static double toInches(int inch) {
		// TODO Auto-generated method stub
		
		return inch*0.0254;
	}

}
