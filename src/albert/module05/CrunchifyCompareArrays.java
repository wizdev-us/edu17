package albert.module05;

import java.util.Arrays;

/**
 * @author Crunchify.com
 * 
 */
 
public class CrunchifyCompareArrays {
	public static void main(String[] args) {
		String[] str1 = { "Crunchify", "dot", "com" };
		String[] str2 = { "google", "dot", "com" };
		String[] str3 = { "Crunchify", "dot", "com" };
 
		// Returns true if the two specified arrays of Objects are equal to one
		// another. The two arrays are considered equal if both arrays contain
		// the same number of elements, and all corresponding pairs of elements
		// in the two arrays are equal.
		System.out.println("Check between str1 & str2: " + Arrays.equals(str1, str2));
		System.out.println("Check between str1 & str3: " + Arrays.equals(str1, str3));
	}
}
