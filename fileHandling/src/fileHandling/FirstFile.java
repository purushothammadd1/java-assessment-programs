package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FirstFile {
	private static boolean isVowel(char ch) {
		return "aeiouAEIOU".contains(String.valueOf(ch));
		
	}
	private static boolean isConsonant( char ch) {
		return "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ".contains(String.valueOf(ch));
	}
	public static void main(String[] args) {
		String path="C:\\Users\\91970\\Desktop\\purushotham.txt";
		Path f= Paths.get(path);
		
		try {
			BufferedReader br = Files.newBufferedReader(f);
			String contents =" ";
			int ch;
			int numVowels =0, numConsonants =0;
			while((ch = br.read()) != -1) {
				contents += (char) ch;
				if(isVowel((char) ch))
					numVowels++;
				if(isConsonant((char) ch))
					numConsonants++;
			}
			System.out.println(contents +" "+ "\n numVowels:" +numVowels+"\n numConsonants:"+numConsonants);
		} catch (IOException e) {
			System.out.println("try a different file name ");
			e.printStackTrace();
		}
		
	}

}
