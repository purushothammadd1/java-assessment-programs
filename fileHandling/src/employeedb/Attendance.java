package employeedb;

import java.sql.Date;

public class Attendance {
	private Employee employee;
	private Date date;
	private boolean isPresent;
	public Attendance(Employee employee, Date date, boolean isPresent) {
		super();
		this.setEmployee(employee);
		this.setDate(date);
		this.setPresent(isPresent);
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isPresent() {
		return isPresent;
	}
	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}
	@Override
	public String toString() {
		return "Attendance [employee=" + employee + ", date=" + date + ", isPresent=" + isPresent + "]";
	}
	
	

}
