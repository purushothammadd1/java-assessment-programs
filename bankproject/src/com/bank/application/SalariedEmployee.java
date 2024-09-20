package com.bank.application;

public class SalariedEmployee extends Customer{
	private double baseSalary;

	public SalariedEmployee() {
		super();
	}
	public SalariedEmployee(int id,String firstname,String lastname,double salary) {
		super(id,firstname,lastname);
		baseSalary=salary;
	}

	public double getSalary() {
		return baseSalary;
	}
	public void setSalary(double salary) {
		this.baseSalary=salary;
	}

	@Override
	public double CalculateSalary() {
		// TODO Auto-generated method stub wite condition statement here

		return baseSalary;
	}
	public String toString() {
		return super.toString()+"Salary:"+CalculateSalary();
//				String.format("% -20s %.2f%n", "salary:",CalculateSalary());
	}

}
