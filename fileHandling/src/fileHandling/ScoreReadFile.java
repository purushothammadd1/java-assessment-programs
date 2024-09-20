package fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class ScoreReadFile {
	public static void main(String[] args){
		
		String path="C:\\Users\\91970\\Desktop\\files\\ScoreFile.txt";
		Path f= Paths.get(path);
		try {
			BufferedReader br=Files.newBufferedReader(f);
			String contents="";
			int ch;
//			int marks=0;
			int highMarks;
//			int high;
//			String name;
//			String highName =null;
			
			while((ch=br.read())!= -1) {
				contents +=(char) ch;
//				String [] array1=ch.split("");
//				name=array1[0];
//				marks=Integer.parseInt(array1[1]);
				
//				if(marks>highMarks) {
//					highMarks = marks;
//					highName = name;
				}
			System.out.println(contents);
//			}
//			System.out.println(highMarks);
//			System.out.println(highName);
		}catch(IOException e) {
			System.out.println("try a different file");
			e.printStackTrace();
		}
		
	}

}
