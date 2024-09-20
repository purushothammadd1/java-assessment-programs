package bankapp;


public class Bank{
	//customer list
	private Customer[] customers = new Customer[1];
	//static variable
	//	private static int custCount;

	//addcustomer method
	public void addCustomer(Customer[] aCustomer) {
		customers = aCustomer;
	}
	//getter the customers
	public Customer[] getCustomers() {
		return customers;
	}
	//getter for cust count
	public static int getCustCount() {
		return getCustCount();
	}
	//customer by Id method
	public Customer[] getCustomerById(long cId) {
		for(int i=0; i < getCustCount(); i++) {
			if( Customer.getCustId() == cId) {
				return customers ;
			}
		}
		return customers;	
	}



}
