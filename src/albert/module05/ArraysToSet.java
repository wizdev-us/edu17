package albert.module05;

import java.util.Arrays;
import java.util.HashSet;

public class ArraysToSet {

	public static void main(String[] args) {
		Integer[] numbers = { 7, 7, 8, 11, 10, 8, 8, 8, 6, 5, 4 };
		HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(numbers));

		System.out.println("Print Set Value via toString(): " + set.toString());
	}
}