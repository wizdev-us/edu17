package albert.module09;

import java.util.LinkedList;
import java.util.ListIterator;
 
public class LinkedListIterator {
 
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Paypal");
		linkedList.add("Google");
		linkedList.add("Yahoo");
		linkedList.add("IBM");
		linkedList.add("Facebook");
 
		// ListIterator approach
		System.out.println("ListIterator Approach: ==========");
		ListIterator<String> listIterator = linkedList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
 
		System.out.println("\nLoop Approach: ==========");
		// Traditional for loop approach
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}
 
		// Java8 Loop
		System.out.println("\nJava8 Approach: ==========");
		linkedList.forEach(System.out::println);
	}
 
}
