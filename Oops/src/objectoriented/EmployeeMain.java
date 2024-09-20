package objectoriented;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee(121,"Purushotham","maddi",40000);
		System.out.println(emp.getAnnualSalary());
		System.out.println("Enter rise percentage:");
		int p=sc.nextInt();
		System.out.println(emp.risePercent(p));
		System.out.println(emp);
		//i need emp2 data
		Employee emp2=new Employee(122,"saiTeja","mukka",35000);
		System.out.println(emp2.getAnnualSalary());
		System.out.println("Enter rise Percentage:");
		int p1=sc.nextInt();
		System.out.println(emp2.risePercent(p1));
		System.out.println(emp2);
	}

}
