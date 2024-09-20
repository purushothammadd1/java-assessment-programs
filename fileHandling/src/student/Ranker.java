package student;

import java.util.Comparator;

public class Ranker implements Comparator<Student> {

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		if(arg0.getMark() > arg1.getMark())
			return -1;
		if(arg0.getMark() < arg1.getMark())
			return 1;
		return 0;
	}
	

}
