package bankapp;

public class PersonalCustomer extends Customer{
	private String workphone;
	private String homephone;

	PersonalCustomer() {
		workphone ="+919876578945";
		homephone="+918584834723";
	}
	
	public PersonalCustomer(String FirstName,String LastName,String Address,Account account) {
		super(FirstName,LastName,Address,account);
		
	}
	public PersonalCustomer(String FirstName,String LastName,String Address,Account account,String workphone,String homephone) {
		super(FirstName,LastName,Address,account);
		this.homephone=homephone;
		this.workphone=workphone;
	}
	public PersonalCustomer(long CustId,String FirstName,String LastName,String Address,Account account,String workphone,String homephone) {
		super(CustId,FirstName,LastName,Address,account);
		this.homephone=homephone;
		this.workphone=workphone;
	}
	public String getWorkphone() {
		return workphone;
	}
	public void setWorkphone(String workphone) {
		this.workphone=workphone;
	}
	public String getHomephone() {
		return homephone;
	}
	public void setHomephone(String homephone) {
		this.homephone=homephone;
	}
	public String toString() {
		return super.toString()+"\n homephone"+homephone+"\n workphone"+workphone;

	}

}
