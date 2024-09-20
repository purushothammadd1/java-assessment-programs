package jdbcclass;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.time.LocalDateTime;

public class Student {
	private String dept;
	private long rollno;
	private String firstname;
	private String lastname;
	private String city;
	private Date dateOfBirth;
	
	public Student(ResultSet rs) throws SQLException{
		String combinedRoll = rs.getString("rollno");
		dept = combinedRoll.substring(0, 3);
		this.rollno = Long.valueOf(combinedRoll.substring(4));
		firstname = rs.getString("firstName");
		lastname = rs.getString("lastName");
		city = rs.getString("city");
		dateOfBirth = rs.getDate("dateOfBirth");
	}
	public String getDept() {
		return dept;
	}

	public long getRollNo() {
		return rollno;
	}

	public String getFirstName() {
		return firstname;
	}

	public String getLastName() {
		return lastname;
	}

	public String getCity() {
		return city;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	@Override
	public String toString() {
		return "Student [dept=" + dept + ", rollNo=" + rollno + ", firstName=" + firstname + ", lastName=" + lastname
				+ ", city=" + city + ", dateOfBirth=" + dateOfBirth + "]";
	}



}
