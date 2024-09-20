package inheritance;

public class Student {
	private int id;
	private String Name,Address;
	public Student() {

	}
	public Student(int id,String name,String address) {
		this.id=id;
		this.Name=name;
		this.Address=address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name=name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address=address;
	}
	public void toLearn() {
		System.out.println("Studying");
	}
	public String toString() {
		return "Id No:"+id+"\n Name Of Student:"+Name+"\n Address: "+Address;
	}
}
