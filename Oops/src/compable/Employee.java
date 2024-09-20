package compable;

public class Employee implements Comparable<Employee>{
	private static int empcount;
	private int empId;
	private String empname;
	private double salary;
	private int Id;

	public Employee() {

	}
	public Employee(int empId,String empname,double salary) {
//		Employee.empcount= ++empcount;
		this.empId=empId;
		this.setEmpname(empname);
		this.setSalary(salary);
	}
	public int compareTo1(Employee otherEmp) {

		return Integer.compare(this.empId, otherEmp.Id);
	}
	public int compareTo(Employee otherSal) {
		return Double.compare(salary, otherSal.salary);
	}

	public static int getEmpcount() {
		return empcount;
	}


	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		return "Employee[empId="+empId+"\n EmployeeName="+empname+"\nEmployee salary="+salary+"]";
	}
	


}

