package inheritance;

public class UgStudent extends Student{
	private String Branch,College;
	public UgStudent() {
		
	}
	public UgStudent(int id,String name,String address, String branch,String college) {
		super(id,name,address);
		this.Branch=branch;
		this.College=college;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		this.Branch=branch;
	}
	public String getCollege() {
		return College;
	}
	public void setCollege(String college) {
		this.College=college;
	}
	public String toString() {
		return super.toString()+"\n Branch: "+Branch+"\n College: "+College;
	}

}
