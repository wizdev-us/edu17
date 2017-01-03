package albert.kang.module01;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author Crunchify.com
 *
 */

public class CrunchifyIdentityHashMapVsHashMapPerformance {
	static Random rand = new Random();

	private static void startCrunchifyTest() {

		// Let's run test for 5 times
		for (int i = 0; i < 15; ++i) {

			// Let's create random Map size which we will use in IdentityHashMap
			// and HashMap
			int randomMapSize = 1000000 + rand.nextInt(9000000);
			String[] crunchifyString = new String[randomMapSize];
			for (int j = 0; j < randomMapSize; ++j)
				// Assign below string to crunchifyString Object
				crunchifyString[j] = "This is Crunchify's Test #" + j;

			System.out.println("\nIteration # " + i + " - Creating String with size: " + randomMapSize);
			crunchifyCompareIdentityHashMapVsHashMap(crunchifyString, new HashMap<String, Integer>(randomMapSize),
					"HashMap");

			// Runs the garbage collector
			System.gc();
			crunchifyCompareIdentityHashMapVsHashMap(crunchifyString,
					new IdentityHashMap<String, Integer>(randomMapSize), "IdentityHashMap");

			// Runs the garbage collector
			System.gc();
		}
	}

	/**
	 * @param crunchifyString
	 * @param crunchifyMap
	 *            : IdentityHashMap / HashMap
	 * @param name
	 */
	private static void crunchifyCompareIdentityHashMapVsHashMap(String[] crunchifyString,
			Map<String, Integer> crunchifyMap, String name) {
		long start = System.currentTimeMillis();

		// put crunchifyString String[] to map
		for (int put = 0; put < crunchifyString.length; ++put)
			crunchifyMap.put(crunchifyString[put], put);

		boolean result = false;
		for (int get = 0; get < crunchifyString.length; ++get) {
			if (crunchifyMap.get(crunchifyString[get]) != get)
				result = true;
		}
		System.out.println(name + " time taken : \t" + (System.currentTimeMillis() - start) / 1000. + " sec");

		// Check for result discrepancy
		if (crunchifyMap.size() != crunchifyString.length)
			System.out.println("Please check size. Test failed");
		if (result)
			System.out.println("Result failed..");
	}

	public static void main(String[] args) {
		System.out.println("IdentityHashMap Vs. HashMap comparison Test started...");

		// method to compare IdentityHashMap and HashMap
		startCrunchifyTest();
	}

}
