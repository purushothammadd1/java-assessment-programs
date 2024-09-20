package com.telusko.programs.jdbc;

public class EmployeeDepartment {
	private int deptId;
	private String depName;
	private double salary;
	public EmployeeDepartment(int deptId, String depName, double salary) {
		super();
		this.deptId = deptId;
		this.depName = depName;
		this.salary = salary;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeDepartment [deptId=" + deptId + ", depName=" + depName + ", salary=" + salary + "]";
	}
}
