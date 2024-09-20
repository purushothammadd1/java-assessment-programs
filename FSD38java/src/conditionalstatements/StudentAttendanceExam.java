package conditionalstatements;

import java.util.Scanner;

public class StudentAttendanceExam {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Total class:");
		int totalclass=sc.nextInt();
		System.out.println("Enter the number of class attended:");
		int attend=sc.nextInt();
		studentAttendance(totalclass,attend);
	}
	public static void studentAttendance(int totalclass, int attend) {
		float per = (attend*100)/totalclass;
		System.out.println(per);
		if(per>=75) {
			System.out.println("you can sit in class and write exam:");
		}
		else {
			System.out.println("you can't sit in class and don't write exam!");
		}
	}
}
