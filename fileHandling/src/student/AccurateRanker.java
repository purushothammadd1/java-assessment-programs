package student;

import java.util.Collections;
import java.util.List;

public class AccurateRanker {
	public void rank(List<Student> students) {
		Collections.sort(students, new Ranker());
		int rank= 1;
		for(Student s: students)
			s.setRank( rank++);
		for(int i=1;i<students.size();i++) {
			if(students.get(i).getMark() == students.get(i -1).getMark());
				students.get(i).setRank(students.get(i -1).getRank());
		}
	}

}
