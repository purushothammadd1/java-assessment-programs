package com.bank.application;

public class CommissionEmployee extends Customer{
	private double commissionRate;
	private double baseSalary;
	private double totalSales;
	public CommissionEmployee() {

	}
	//	public CommissionEmployee(double commissionRate, double baseSalary,double totalsales) {
	//		this.commissionRate=commissionRate;
	//		this.baseSalary=baseSalary;
	//		this.totalSales=totalSales;
	//	}
	public CommissionEmployee(int id,String firstname,String lastname,double commissionRate,double baseSalary,double totalSales) {
		super(id,firstname,lastname);
		this.commissionRate=commissionRate;
		this.baseSalary=baseSalary;
		this.totalSales=totalSales;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public double getSales() {
		return totalSales;
	}
	public void setCommissionRate(double rate) {
		this.commissionRate=rate;
	}
	public void setBaseSalary(double salary) {
		this.baseSalary=salary;
	}
	public void setSales(double sales) {
		this.totalSales=sales;
	}
	public double calculateCommission() {
		return totalSales *commissionRate;
	}
	@Override
	public double CalculateSalary() {
		// TODO Auto-generated method stub
		return calculateCommission() +baseSalary;
	}
	public String toString() {
		return super.toString() +"Salary:"+CalculateSalary();
				
				//String.format("% -20s %.2f%n", "salary:",CalculateSalary());
	}
}
