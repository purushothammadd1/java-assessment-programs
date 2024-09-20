package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentFile {
	private static double median(List<Integer> numbers) {
		Collections.sort(numbers);
		int Size =numbers.size();
		if(Size % 2 ==1 )
			return numbers.get( Size/2);
		return 0.5* (numbers.get(Size/ 2 - 1)+ numbers.get(Size /2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path file =Paths.get("C:\\Users\\91970\\Desktop\\files\\StudentMarks");
		Path output =Paths.get("C:\\Users\\91970\\Desktop\\files\\Output");
		try {
			BufferedReader br=Files.newBufferedReader(file);
			String line= br.readLine();
			String topperName="";
			int topperScore=0;
			List<Integer> marks =new ArrayList<>();
			while(line != null) {
				String[] components =line.split(",");
				if(Integer.valueOf(components[1]) > topperScore) {
					topperName =components[0];
					topperScore=Integer.valueOf(components[1]);
				}
				marks.add(Integer.valueOf(components[1]));
				line =br.readLine();
			}
			BufferedWriter bw =Files.newBufferedWriter(output, StandardOpenOption.APPEND);
			bw.write(topperName+","+topperScore+"\n");
			bw.write("median:"+median(marks));
			bw.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
