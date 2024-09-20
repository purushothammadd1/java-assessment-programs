package student;

public class Student {
	private double mark;
	private String name;
	private int rank;
	
	public Student(double mark, String name) {
		this.mark=mark;
		this.name=name;
		this.rank=-1;
	}
	public void setRank(int rank) {
		this.rank=rank;
	}
	public double getMark() {
		return mark;
	}
	public String getName() {
		return name;
	}
	public int getRank() {
		return rank;
	}
	public Student(String fileLine) {
		String[] compoents =fileLine.split(",");
		this.name =compoents[0];
		this.mark=Double.valueOf(compoents[1]);
		this.rank=-1;
	}
	@Override
	public String toString() {
		return rank+","+ name+", "+mark;
	}

}
