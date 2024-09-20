package inheritance;

public class StudentMain {

	public static void main(String[] args) {
		UgStudent ug1=new UgStudent(491,"purushotham","Hyd","ECE","SMGOIH");
		System.out.println(ug1);
		System.out.println("==========================");
		PGStudent pg1=new PGStudent(468, "Harish","Hyd","ECE" ,"SMICH","AI", "JNTUH");
		System.out.println(pg1);

	}

}
