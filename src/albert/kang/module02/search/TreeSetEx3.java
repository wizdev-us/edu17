package albert.kang.module02.search;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx3 {

	public static void main(String[] args) {
		TreeSet<String> words = new TreeSet<String>();

		words.add("apple");
		words.add("banana");
		words.add("china");
		words.add("cypher");
		words.add("description");
		words.add("ever");
		words.add("guess");
		words.add("cherry");

		System.out.println("[c~f 사이의 단어 검색]");
		NavigableSet<String> rangeSet = words.subSet("c", true, "f", true);

		for (String word : rangeSet) {
			System.out.println(word);
		}
	}

}
