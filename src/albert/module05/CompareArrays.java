package albert.module05;

import java.util.Arrays;

public class CompareArrays {

	public static void main(String[] args) {
		String[] str1 = { "bwg", "dot", "com" };
		String[] str2 = { "google", "dot", "com" };
		String[] str3 = { "bwg", "dot", "com" };

		System.out.println("Check between str1 & str2: " + Arrays.equals(str1, str2));
		System.out.println("Check between str1 & str3: " + Arrays.equals(str1, str3));
	}
}
