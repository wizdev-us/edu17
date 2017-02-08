package albert.module11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class QuizCountWordsLineCharacters {

	public static void main(String[] args) {
		try {
			readAndPrintCounts("src\\albert\\module11\\QuizCountWordsLineCharacters.java");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
//	* Total Characters: 1016
//	* Total Words: 167
//	* Toal Lines: 63
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void readAndPrintCounts(String crunchifyFile) throws FileNotFoundException {

		int totalWords = 0;
		int totalLines = 0;
		int totalCharacters = 0;
		String line;

		try (BufferedReader crunchifyBuffer = new BufferedReader(new FileReader(crunchifyFile))) {
			while ((line = crunchifyBuffer.readLine()) != null) {
				totalLines++;
				String[] myWords = line.replaceAll("\\s+", " ").split(" ");

				for (String s : myWords) {
					totalCharacters += s.length();
				}
				totalWords += myWords.length;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("* Total Characters: " + totalCharacters);
		System.out.println("* Total Words: " + totalWords);
		System.out.println("* Toal Lines: " + totalLines);
	}

}
