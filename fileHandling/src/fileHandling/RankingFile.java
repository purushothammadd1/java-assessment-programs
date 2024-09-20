package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class RankingFile {
	public static void main(String[] args) {
		Path file =Paths.get("C:\\Users\\91970\\Desktop\\files\\marks.txt");
		Path output=Paths.get("output.txt");
		
		try {
			BufferedReader br= Files.newBufferedReader(file);
			String line=br.readLine();
			List<Integer> marks=new ArrayList<>();
			List<String> studentNames=new ArrayList<>();
			Map<Integer,String> data=new HashMap<Integer,String>();
			
			while(line !=null) {
				String[] text=line.split(", ");
				marks.add(Integer.valueOf(text[1]));
				studentNames.add(text[0]);
				
				data.put((Integer.valueOf(text[1])),text[0]);
				line =br.readLine();
			}
			BufferedWriter bw=Files.newBufferedWriter(output,StandardOpenOption.APPEND);
			
			Collections.sort(marks,Collections.reverseOrder());
			
			for(int i=0;i<marks.size();i++) {
				bw.write("rank:"+(i+1)+", "+data.get(marks.get(i))+":"+marks.get(i)+"\n");
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			System.out.println("File is not created");
			e.printStackTrace();
		}
	}

}
