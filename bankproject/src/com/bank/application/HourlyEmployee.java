package com.bank.application;

public class HourlyEmployee extends Customer{
	private double hoursworked;
	private double hourlyRate;
	public HourlyEmployee(int Id,String firstname,String lastname,double hoursworked,double hourlyRate) {
		super(Id,firstname,lastname);
		this.hoursworked=hoursworked;
		this.hourlyRate=hourlyRate;
	}
	public double getHoursWorked() {
		return hoursworked;
	}
	public void setHoursWorked(double HoursWorked) {
		this.hoursworked=HoursWorked;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate=hourlyRate;
	}
	public double CalculateSalary() {
		double salary=0;
		double overtime=0;
		if(hoursworked >40) {
			double hours= hoursworked -40;
			hoursworked =40;
			overtime=hours*(hourlyRate*1.5);
		}
		salary =hoursworked*hourlyRate;
		salary += overtime;
		return salary;
	}
	public String toString() {
		return super.toString()+"\n"+"Salary:"+CalculateSalary();
//				String.format("% -20s %.2f%n", "salary:",CalculateSalary());
	}

}
