package com.interview.pract;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeesUsingStreams {
	
	public static void main(String[] args) {
		List<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee("purushotham",24,150000.00));
		emp.add(new Employee("mithali raj",30,90000.00));
		emp.add(new Employee("smriti mandhana",25,70000.00));
		emp.add(new Employee("priya punia",23,40000.00));
		emp.add(new Employee("sneh rana",24,50000.00));
		emp.add(new Employee("taniya bhatia",25,60000.00));
		
		//print the original list
		emp.forEach(e -> System.out.println(e));
		System.out.println("-------------------------");
		
		//sort the list by name
		List<Employee> sortedByName=emp.stream()
		.sorted((e1,e2) -> e1.name.compareTo(e2.name))
		.collect(Collectors.toList());
		sortedByName.forEach(System.out :: println);
		System.out.println("-------------------------");
		//sort the list by age
		List<Employee> sortByAge=emp.stream().sorted(Comparator.comparingInt(Employee :: getAge))
			.collect(Collectors.toList());
		sortByAge.forEach(e -> System.out.println(e));
		System.out.println("-------------------------");
		//sort by the salary of the employees
		List<Employee> sortBySalary =emp.stream().sorted(Comparator.comparingDouble(Employee :: getSalary))
				.collect(Collectors.toList());
		sortBySalary.forEach(e -> System.out.println(e));
	}
	static class Employee{
		
		private String name;
		private int age;
		private double salary;
		
		
		public Employee(String name, int age, double salary) {
			super();
			this.name = name;
			this.age = age;
			this.salary = salary;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
		}
		
		
		
		
	}

}
