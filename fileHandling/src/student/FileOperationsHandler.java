package student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileOperationsHandler {
	public List<Student> readAll(String path) throws IOException{
		Path file =Paths.get(path);
		BufferedReader br =Files.newBufferedReader(file);
		List<Student> allStudents =new ArrayList<>();
		String line =br.readLine();
		while(line != null && !line.equals(" ")) {
			allStudents.add(new Student(line));
			line =br.readLine();
		}
		return allStudents;
	}
	public void writeAll(List<Student> students, String path) throws IOException{
		Path file=Paths.get(path);
		BufferedWriter br =Files.newBufferedWriter(file, StandardOpenOption.WRITE);
		for(Student s: students)
			br.write(s.toString()+"\n");
		br.close();
	}

}
