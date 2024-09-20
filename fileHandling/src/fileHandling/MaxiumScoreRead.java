package fileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MaxiumScoreRead {
	public static void main(String[] args) {
		String path="C:\\Users\\91970\\Desktop\\files\\ScoreFile.txt";
		Path file =Paths.get(path);
		
		try {
			BufferedReader br=Files.newBufferedReader(file);
			//constructor file 
			//String contents="";
			String ch ;
			int marks=0;
			int highMarks=0;
		    //int high;
		    String name;
		    String highName = null;
		    
			while ((ch=br.readLine())!=null) {
				String[] text1 = ch.split(" ");
		        name = text1[0];
		        marks = Integer.parseInt(text1[1]);

		        if (marks > highMarks) {
		          highMarks = marks;
		          highName = name;
		        }
			}
			
			System.out.println( highName+","+highMarks);
			

		} catch (IOException e) {
			System.out.println("try a different file");
			e.printStackTrace();
		}	
			
		}
		}