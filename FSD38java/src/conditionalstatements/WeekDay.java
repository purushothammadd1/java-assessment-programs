package conditionalstatements;

import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner wd=new Scanner(System.in);
		System.out.println("Enter choice:");
		int day=wd.nextInt();
		weekDays(day);

	}

	public static void weekDays(int day) {
		// TODO Auto-generated method stub
		switch(day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("wednessday");
			break;
		case 5:
			System.out.println("Thurday");
			break;
		case 6:
			System.out.println("Firday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default :
			System.out.println("choose the correct choice");
		}
		
	}

}
