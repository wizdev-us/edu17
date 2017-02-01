package albert.module09.tmp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("Jack", 30);
		map.put("Andy", 40);
		map.put("John", 22);
		map.put("Jolie", 10);
		map.put("Exo", 50);
		map.put("Tiger", 91);

		System.out.println("총 Entry 수: " + map.size());

		System.out.println("\tJolie" + map.get("Jolie"));
		System.out.println();

		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();

		while (it.hasNext()) {
			String key = it.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}

		System.out.println();

		// 객체 삭제
		map.remove("Exo");
		System.out.println("총 Entry 수: " + map.size());

		map.clear();
		System.out.println("총 Entry 수: " + map.size());
	}

}


//Map<K, V> map = ~;
//
//Set<K> keySet = map.keySet();
//Iterator<K> it = keySet.iterator();
// 
//while (it.hasNext()) {
//    K key = it.next();
//    V value = map.get(key);
//}


//Set<Map.Entry<K, V>> entrySet = map.entrySet();
//
//Iterator<Map.Entry<K, V>> entryIt = entrySet.iterator();
// 
//while (entryIt.hasNext()) {
//    Map.Entry<K, V> entry = entryIt.next();
// 
//    K key = entry.getKey();
//    V value = entry.getValue();
//}

