package albert.kang.module01.map;

import java.util.*;

/**
 * @author Crunchify.com
 * 
 */

public class SortedMapEx1 {
	/*
	 * Sort a map according to values.
	 * 
	 * @param <K> the key of the map.
	 * 
	 * @param <V> the value to sort according to.
	 * 
	 * @param crunchifySortMap the map to sort.
	 * 
	 * @return a map sorted on the values.
	 */
	public static <K, V extends Comparable<? super V>> Map<K, V> crunchifySortMap(final Map<K, V> mapToSort) {
		List<Map.Entry<K, V>> entries = new ArrayList<Map.Entry<K, V>>(mapToSort.size());

		entries.addAll(mapToSort.entrySet());

		// Sorts the specified list according to the order induced by the
		// specified comparator
		Collections.sort(entries, new Comparator<Map.Entry<K, V>>() {
			@Override
			public int compare(final Map.Entry<K, V> entry1, final Map.Entry<K, V> entry2) {
				// Compares this object with the specified object for order
				return entry1.getValue().compareTo(entry2.getValue());
			}
		});

		Map<K, V> sortedCrunchifyMap = new LinkedHashMap<K, V>();

		// The Map.entrySet method returns a collection-view of the map
		for (Map.Entry<K, V> entry : entries) {
			sortedCrunchifyMap.put(entry.getKey(), entry.getValue());
		}

		return sortedCrunchifyMap;
	}

	public static void main(String args[]) {

		Random random = new Random(System.currentTimeMillis());

		// Variable with size 10
		Map<String, Integer> initialCrunchifyMapValue = new HashMap<String, Integer>(10);
		for (int i = 0; i < 10; ++i) {
			initialCrunchifyMapValue.put("Crunchify # " + i, random.nextInt(500));
		}

		log("Initial CrunchifyMapValue ========== \n");
		for (Map.Entry<String, Integer> entry : initialCrunchifyMapValue.entrySet()) {
			log(entry.getKey() + "\t" + entry.getValue());
		}

		Map<String, Integer> sortedCrunchifyMapValue = new HashMap<String, Integer>(10);

		// Sort Map on value by calling crunchifySortMap()
		sortedCrunchifyMapValue = SortedMapEx1.crunchifySortMap(initialCrunchifyMapValue);

		log("\nSorted CrunchifyMapValue ========== \n");

		for (Map.Entry<String, Integer> entry : sortedCrunchifyMapValue.entrySet()) {
			log(entry.getKey() + "\t" + entry.getValue());
		}
	}

	private static void log(String value) {
		System.out.println(value);

	}
}