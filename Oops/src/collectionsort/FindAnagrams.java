package collectionsort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FindAnagrams {
	public static void main(String[] args) {
		String filePath="sampleData.txt";
		List<String> anagramWords=anagramsList(filePath);
		for(String words: anagramWords) {
			System.out.println(words);
		}
	}
	public static List<String> anagramsList(String filePath){
		List<String> anagrams=new ArrayList<>();
			try {
				BufferedReader br=new BufferedReader(new FileReader(filePath));
				String word;
				Map<String, String> anagrams_dict=new LinkedHashMap<String,String>();
				try {
					while((word =br.readLine()) != null) {
						String key=generateKey(word);
						if(anagrams_dict.containsKey(key)) {
							anagrams_dict.put(key, anagrams_dict.get(key)+","+word);
						}else {
							anagrams_dict.put(key, word);
						}
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for(String key:anagrams_dict.keySet()) {
					String val=anagrams_dict.get(key);
					if(val.indexOf(",")>0) {
						anagrams.add(val);
					}
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return null;
		
	}
	private static String generateKey(String word) {
		// TODO Auto-generated method stub
		char[] letters=word.toCharArray();
		Arrays.sort(letters);
		
		return new String(letters);
	}

}
