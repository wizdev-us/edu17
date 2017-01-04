package albert.kang.module01.list;

import java.util.ArrayList;

/**
 * @author Crunchify.com
 * 
 */
 
public class CrunchifyJavaIteratorConcurrentModificationException {
 
	public static void main(String[] args) {
		ArrayList<String> company = new ArrayList();
		company.add("eBay");
		company.add("Paypal");
		company.add("Google");
 
		for (String s : company) {
			System.out.println(s);
			company.add("Yahoo");
		}
	}
}
