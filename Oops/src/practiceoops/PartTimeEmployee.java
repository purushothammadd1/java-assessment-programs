package practiceoops;

public class PartTimeEmployee extends Employee {
	private int hoursworked;
	private double amountperhour;
	//defalut constructor
	public PartTimeEmployee() {
		
	}
	//parameterised constructor
	public PartTimeEmployee(int id,String firstname,String lastname,int salary,int hoursWorked,double amountperhour) {
		super(id,firstname,lastname,salary);
		this.hoursworked=hoursworked;
		this.amountperhour=amountperhour;
	}
	public int computeSal() {
		//salary based on working hours 
		return hoursworked=hoursworked/54;
		
	}
	public void showDetails() {
		
	}
	

}
