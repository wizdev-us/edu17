package albert.kang.module01;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
 
/**
 * @author Crunchify.com 
 * How to get Random Element from ArrayList?
 */
 
public class CrunchifyRandomFromArrayList {
 
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
 
			log("Loop # " + i + " : " + getRandomCompany());
		}
 
		getRandomDouble();
		getRandomInteger();
	}
 
	// a ThreadLocalRandom is initialized with an internally generated seed that may not otherwise be modified. When
	// applicable, use of ThreadLocalRandom rather than shared Random objects in concurrent programs will typically
	// encounter much less overhead and contention.
	private static void getRandomInteger() {
		int crunchifyInteger = ThreadLocalRandom.current().nextInt(1, 50);
		log("RandomInteger: " + crunchifyInteger);
 
	}
 
	private static void getRandomDouble() {
		double crunchifyDouble = ThreadLocalRandom.current().nextDouble(1, 250);
		log("RandomDouble: " + crunchifyDouble);
 
	}
 
	public static String getRandomCompany() {
		ArrayList<String> companyName = new ArrayList<String>();
 
		companyName.add("Google");
		companyName.add("Facebook");
		companyName.add("Twitter");
		companyName.add("Paypal");
		companyName.add("Uber");
		companyName.add("Yahoo");
 
		// Get Random Company Name from Arraylist using Random().nextInt()
		String company = companyName.get(new Random().nextInt(companyName.size()));
		return company;
	}
 
	private static void log(Object crunchifyObject) {
		System.out.println(crunchifyObject);
 
	}
}
