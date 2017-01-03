package albert.kang.module02.search;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx2 {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		for (int i = 0; i < 5; i++) {
			treeSet.add(new Integer((int) Math.round(Math.random() * 70 + 30)));
		}

		NavigableSet<Integer> descendingSet = treeSet.descendingSet();

		for (Integer score : descendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();

		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		for (Integer score : ascendingSet) {
			System.out.print(score + " ");
		}
	}

}
