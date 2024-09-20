package fileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StudentMarksScore {
	public static void main(String[] args) {
		Path file =Paths.get("C:\\Users\\91970\\Desktop\\files\\ScoreFile");
		try {
			BufferedReader br=Files.newBufferedReader(file);
			String line=br.readLine();
			String topperName="";
			int topperScore= 0;
			while (line !=null) {
				String[] text=line.split(",");
				if(Integer.valueOf(text[1]) > topperScore) {
					topperName =text[0];
					topperScore =Integer.valueOf(text[1]);
				}
				System.out.println(topperName +","+topperScore);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
