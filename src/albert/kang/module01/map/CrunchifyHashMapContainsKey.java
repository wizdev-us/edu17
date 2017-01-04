package albert.kang.module01.map;

import java.util.HashMap;
import java.util.Map;
 
/**
 * 
 * @author http://Crunchify.com
 */
 
public class CrunchifyHashMapContainsKey {
	static Map<String, String> crunchifyComapnies = new HashMap<>();
 
	private static void checkIfValueExist(String value) {
		// Let's checkout if Value exist
		String result = crunchifyComapnies.containsValue(value) ? ("Value (" + value + ") exist")
				: ("Value (" + value + ") doesn't exist");
		log(result);
	}
 
	private static void checkIfKeyExist(String key) {
		// Let's checkout if Key exist
		String result = crunchifyComapnies.containsKey(key) ? (crunchifyComapnies.get(key))
				: ("Key (" + key + ") doesn't exist");
		log(result);
	}
 
	public static void main(String[] args) {
 
		crunchifyComapnies.put("Google", "Mountain View, CA");
		crunchifyComapnies.put("Yahoo", "Santa Clara, CA");
		crunchifyComapnies.put("Microsoft", "Redmond, WA");
 
		checkIfKeyExist("Google");
		checkIfKeyExist("Facebook");
		checkIfKeyExist("Twitter");
		checkIfKeyExist("Yahoo");
 
		System.out.println("\n");
		checkIfValueExist("Mountain View, CA");
		checkIfValueExist("San Jose, CA");
	}
 
	private static void log(Object object) {
		System.out.println(object);
 
	}
}
