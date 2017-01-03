package albert.kang.module02.search;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		treeMap.put(new Integer(90), "Jack");
		treeMap.put(new Integer(77), "Mike");
		treeMap.put(new Integer(82), "Jolie");
		treeMap.put(new Integer(93), "Sminoph");
		treeMap.put(new Integer(67), "Neil");
		treeMap.put(new Integer(55), "Max");

		Map.Entry<Integer, String> entry = null;

		entry = treeMap.firstEntry();
		System.out.println("가장 낮은 점수: " + entry.getKey() + "-" + entry.getValue());

		entry = treeMap.lastEntry();
		System.out.println("가장 높은 점수: " + entry.getKey() + "-" + entry.getValue());

		entry = treeMap.lowerEntry(new Integer(95));
		System.out.println("95점 아래 점수: " + entry.getKey() + "-" + entry.getValue());

		while (!treeMap.isEmpty()) {
			entry = treeMap.pollFirstEntry();

			System.out.println(entry.getKey() + "-" + entry.getValue() + " (남은 객체 수: " + treeMap.size() + ")");
		}
	}

}
