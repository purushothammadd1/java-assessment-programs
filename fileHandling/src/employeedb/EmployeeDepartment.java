package employeedb;

public class EmployeeDepartment {
	private int depId;
	private String deptName;
	private double salary;
	public EmployeeDepartment(int depId, String deptName, double salary) {
		super();
		this.depId = depId;
		this.deptName = deptName;
		this.salary = salary;
	}
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeDepartment [depId=" + depId + ", deptName=" + deptName + ", salary=" + salary + "]";
	}
	

}
