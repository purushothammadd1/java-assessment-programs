package student;

import java.io.IOException;
import java.util.List;

public class RankerTest {
	public static void main(String[] args) {
		String filePath="C:\\Users\\91970\\Desktop\\files\\marks";
		FileOperationsHandler f =new FileOperationsHandler();
		List<Student> allStudents;
		try {
			allStudents =f.readAll(filePath);
			new AccurateRanker().rank(allStudents);
			f.writeAll(allStudents, "C:\\Users\\91970\\Desktop\\files\\output");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
