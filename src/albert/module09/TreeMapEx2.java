package albert.module09;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx2 {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		treeMap.put(new Integer(100), "Jolie");
		treeMap.put(new Integer(95), "SAN E");
		treeMap.put(new Integer(81), "ZICO");
		treeMap.put(new Integer(79), "MICRODOT");
		treeMap.put(new Integer(71), "BASICK");
		treeMap.put(new Integer(67), "MINO");
		treeMap.put(new Integer(52), "Black Nut");

		NavigableMap<Integer, String> descendingMap = treeMap.descendingMap();
		Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();

		for (Map.Entry<Integer, String> entry : descendingEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
		System.out.println();

		NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
		Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();

		for (Map.Entry<Integer, String> entry : ascendingEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
	}

}
