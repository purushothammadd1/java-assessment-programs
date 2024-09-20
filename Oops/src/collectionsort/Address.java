package collectionsort;

public class Address implements Comparable<Address> {
	private String streetName;
	private int pincode;
	
	public Address() {

	}
	
	public Address(String streetName, int pincode) {
		
		this.streetName = streetName;
		this.pincode = pincode;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public int compareTo(Address o) {
		return this.getPincode() - o.getPincode();
		
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", pincode=" + pincode + "]"+"\n";
	}


}
