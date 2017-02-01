package albert.module09.tmp;

import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		for (int i = 0; i < 5; i++) {
			treeSet.add(new Integer((int) Math.round(Math.random() * 50 + 50)));
		}

		Integer score = null;

		score = treeSet.first();
		System.out.println("가장 낮은 점수: " + score);

		score = treeSet.last();
		System.out.println("가장 높은 점수: " + score);

		score = treeSet.lower(new Integer(90));
		System.out.println("90점 아래 점수: " + score);

		score = treeSet.higher(new Integer(90));
		System.out.println("90점 위 점수: " + score);

	}

}
