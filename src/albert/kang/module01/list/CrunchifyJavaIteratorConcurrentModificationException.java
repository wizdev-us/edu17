package albert.kang.module01.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Crunchify.com
 * 
 */

public class CrunchifyJavaIteratorConcurrentModificationException {

	public static void main(String[] args) {
		List<String> company = Collections.synchronizedList(new ArrayList<String>());
		company.add("eBay");
		company.add("Paypal");
		company.add("Google");
		company.add("Google");
		company.add("Google");

		synchronized (company) {
			for (String s : company) {
				System.out.println(s);
				company.add("Yahoo");
			}
		}
	}
}
