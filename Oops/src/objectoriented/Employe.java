package objectoriented;

public class Employe {
	int id;
	String firstName;
	String lastName;
	double salary;
	float percent;
	

	public Employe() {

	}

	public Employe(int Id, String firstName, String secondName, double salary, float perct) {
		this.id = Id;
		this.firstName = firstName;
		this.lastName = secondName;
		this.salary = salary;
		this.percent=perct;
		

		// this is the keyword that refers to the current variable.
	}

	public int getId1() {
		return id;
	}
	public int getId2() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFristName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
		public double getsalary() {
			return salary;
		}

		public void setsalary(double salary) {
			this.salary = salary;
		}

		public double getAnnualSalary() {
			return salary * 12;
		}

		public double raiseSalary() {
			return salary + ((salary * percent) / 100);
		}

		public String toString() {
			return "The emp id is " + id + ". The name is " + firstName + " " + lastName + ". \nThe salary is " + salary
					+ " and the annual salary is " + getAnnualSalary() + " \nAnd after the hike salary is " + raiseSalary();




}
}
