package bankapp;

public abstract class Customer {
	private static long custId;
	private String firstname;
	private String lastname;
	private String address;
	private Account account;
	//static variable
	static int count;

	//create a static variable called count in coustomer class and next step increment the count variable in each constructor.
	//Assign count to custid instance variable in each constructor except the constructor which takes a custId parameter.
	public Customer() {
		
	}
	public Customer(String fName, String lName, String add, Account depAcc, String homeph, String workph){
		count++;
		custId=count;
		firstname="purushotham";
		lastname="maddi";
		address="hyd";
		account =new Account();
	}
	public  Customer(String FirstName, String LastName, String Address,Account account) {
		count++;
		custId=count;
		this.firstname=FirstName;
		this.lastname=LastName;
		this.address=Address;
		this.account=account;
	}
	public Customer(long CustId,String FirstName,String LastName,String Address,Account account) {
		count++;
		this.custId=CustId;
		this.firstname=FirstName;
		this.lastname=LastName;
		this.address=Address;
		this.account=account;
	}
	public static long getCustId() {
		return custId;
	}
	//	public void setCustId(long CustId) {
	//		this.custId=CustId;
	//	}
	public String getFirstName() {
		return firstname;
	}
	public void setFirstName(String FirstName) {
		this.firstname=FirstName;
	}
	public String getLastName() {
		return lastname;
	}
	public void setLastName(String LastName) {
		this.lastname=LastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String Address) {
		this.address=Address;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account=account;
	}
	public String getName() {
		return firstname +" "+ lastname;
	}
	public String toString() {
		return " CustomerId: "+custId+"\nFirstName of Customer:"+firstname+"\nLastName of Customer: "+lastname+"\nAddress: "+address+"\nAccount:"+account;
	}

}
