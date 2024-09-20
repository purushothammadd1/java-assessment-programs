package practiceoops;

public class Employee {
	private int id;
	private String firstname;
	private String lastname;
	private int salary;
	
	public Employee() {
		
	}
	public Employee(int id,String firstname,String lastname,int salary) {
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.salary=salary;
	}
	public int getID() {
		return id;
	}
	public String getFirstName() {
		return firstname;
	}
	public String getLastName() {
		return lastname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public String getFullName() {
		return firstname+" "+lastname;
	}
//	public int getAnnualSalary() {
//		return (this.salary)*12;
//	}
//	public int raiseSalary(int percent) {
//		return (this.salary*percent)/100;
//	}
	public String toString() {
		return "Employee Id:"+id+"FirstName: "+firstname+" \nLastName :"+lastname+" \n Employee Salary:"+salary;
	}
	

}
