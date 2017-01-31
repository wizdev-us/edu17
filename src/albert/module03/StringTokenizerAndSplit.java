package albert.module03;

import java.util.StringTokenizer;

public class StringTokenizerAndSplit {

	public static void main(String[] args) {
		String delims = ",";
		String splitString = "one,two,,three,four,,five";

		System.out.println("StringTokenizer Example: \n");
		StringTokenizer st = new StringTokenizer(splitString, delims);

		while (st.hasMoreElements()) {
			System.out.println("StringTokenizer Output: " + st.nextElement());
		}

		System.out.println("\n\nSplit Example: \n");
		String[] tokens = splitString.split(delims);

		for (int j = 0; j < tokens.length; j++) {
			System.out.println("Split Output: " + tokens[j]);
		}
	}
}