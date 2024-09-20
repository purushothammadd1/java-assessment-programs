package objectoriented;

public class Employee {
	private int Id_No;
	private String First_Name;
	private String Last_Name;
	private double Salary;
	//defalut constructor
	public Employee() {
		
	}
	//parameterized constructor
	public Employee(int id,String fname,String lname,double Sal) {
		Id_No=id;
		First_Name=fname;
		Last_Name=lname;
		Salary=Sal;
	}
	//getAnnualSalary method 
	public double getAnnualSalary() {
		
		return (this.Salary)*12;
	}
	public double risePercent(int p) {
		return (this.Salary*p)/100;
	}

	public String toString() {
		return "Employee [Id_No=" + Id_No + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name + ", Salary="
				+ Salary + "]";
	}
	
}
