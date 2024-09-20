package bankapp;

public class CommericalCustomer extends Customer{
	private String contactpersonname;
	private String contactphone;
	public CommericalCustomer() {
		
	}
	public CommericalCustomer(String FirstName,String LastName,String Address,Account account) {
		super();
		
	}
	public CommericalCustomer(String FirstName,String LastName,String Address,Account account,String contactpersonname,String contactphone) {
		super();
		this.contactpersonname=contactpersonname;
		this.setContactphone(contactphone);
	}
	public String getContactpersonname() {
		return contactpersonname;
	}
	public void setContactpersonname(String contactpersonname) {
		this.contactpersonname =contactpersonname;
	}
	public String getContactphone() {
		return contactphone;
	}
	public void setContactphone(String contactphone) {
		this.contactphone = contactphone;
	}
	@Override
	public String toString() {
		return "CommericalCustomer [contactpersonname=" + contactpersonname + ", contactphone=" + contactphone + "]";
	}
	
}