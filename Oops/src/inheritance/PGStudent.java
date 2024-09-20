package inheritance;

public class PGStudent extends UgStudent{
	private String Specialization,University;
	
	public PGStudent(){
		
	}
	public PGStudent(int id,String name,String address, String branch,String college,String specialization,String University) {
		super(id,name,address,branch,college);
		this.Specialization=specialization;
		this.University=University;
	}
	public String getSpecialization() {
		return Specialization;
	}
	public void setSpecialization(String Specialization) {
		this.Specialization=Specialization;
	}
	public String getUniversity() {
		return University;
	}
	public void setUniversity(String University) {
		this.University=University;
	}
	public String toString() {
		return super.toString()+"\n Specialization : "+Specialization+"\n University : "+University;
	}
}
