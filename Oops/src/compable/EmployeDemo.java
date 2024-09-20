package compable;

import java.util.*;

public class EmployeDemo {

	public static void main(String[] args) {
		Employee emp1=new Employee(1,"purushotham",10000);
		Employee emp2=new Employee(203,"raghunath",15000);
		Employee emp3=new Employee(201,"harish",20000);
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
//		System.out.println(emplist);
		
		System.out.println("before sorting ");
		printEmployeeDetails(emplist);
		System.out.println();
		Collections.sort(emplist);
		System.out.println("AfterSorting :");
		printEmployeeDetails(emplist);
	}

	private static void printEmployeeDetails(ArrayList<Employee> emplist) {
		
	}

	
}
