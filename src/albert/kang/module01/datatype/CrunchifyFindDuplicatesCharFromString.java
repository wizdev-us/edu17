package albert.kang.module01.datatype;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
 
/**
 * @author Crunchify.com
 * 
 */
 
public class CrunchifyFindDuplicatesCharFromString {
 
	Map<Character, Integer> crunchifyAllDuplicate;
 
	// Returns a Set view of the keys contained in this map
	Set<Character> crunchifyKeys;
	static boolean amIDuplicate;
 
	public static boolean isAmIDuplicate() {
		return amIDuplicate;
	}
 
	public void setAmIDuplicate(boolean amIDuplicate) {
		CrunchifyFindDuplicatesCharFromString.amIDuplicate = amIDuplicate;
	}
 
	public static void main(String a[]) {
		CrunchifyFindDuplicatesCharFromString object = new CrunchifyFindDuplicatesCharFromString();
 
		// Test1
		object.crunchifyFindDuplicateChar("CrunchifyFindDuplicateChar");
		System.out.println("Any Duplicate Char? " + isAmIDuplicate());
 
		// Test2
		object.crunchifyFindDuplicateChar("Crunchify");
		System.out.println("Any Duplicate Char? " + isAmIDuplicate());
	}
 
	public void crunchifyFindDuplicateChar(String mySting) {
		crunchifyAllDuplicate = new HashMap<Character, Integer>();
		crunchifyKeys = crunchifyAllDuplicate.keySet();
		setAmIDuplicate(false);
		char[] charArr = mySting.toCharArray();
 
		// Iterate through String
		for (Character myChar : charArr) {
			if (crunchifyAllDuplicate.containsKey(myChar)) {
 
				// Just increment counter if Character presents
				crunchifyAllDuplicate.put(myChar, crunchifyAllDuplicate.get(myChar) + 1);
			} else {
				crunchifyAllDuplicate.put(myChar, 1);
			}
		}
 
		System.out.println("\n========== Let's print all results. Here is a String: " + mySting + " ==========");
		for (Character myChar : crunchifyKeys) {
			if (crunchifyAllDuplicate.get(myChar) > 1 && crunchifyAllDuplicate != null) {
				setAmIDuplicate(true);
				System.out.println("Character " + myChar + " appeared " + crunchifyAllDuplicate.get(myChar) + " times");
			}
		}
	}
}
