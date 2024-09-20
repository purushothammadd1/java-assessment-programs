package fileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemo {
	public static void main(String[] args) {
		String path=" C:\\Users\\91970\\Desktop\\purushotham.txt";
		Path f= Paths.get(path);
		try {
			BufferedReader br =Files.newBufferedReader(f);
			String contents=" ";
			int ch;
			while((ch = br.read())!=1) {
				contents += (char) ch;
			}
			System.out.println(contents);
		}catch(IOException e) {
			System.out.println("try a different file name");
			e.printStackTrace();
		}
	}
}
