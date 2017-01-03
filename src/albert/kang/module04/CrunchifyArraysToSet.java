package albert.kang.module04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
 
/**
 * @author Crunchify.com
 */
 
public class CrunchifyArraysToSet {
 
	public static void main(String[] args) {
		   Integer[] numbers = { 7, 7, 8, 9, 10, 8, 8, 9, 6, 5, 4 };
 
		    Set<Integer> set = new HashSet<Integer>(Arrays.asList(numbers));
 
		    System.out.println("Print Set Value via toString(): " + set.toString());
 
		    //if you want to use Iterator to print value
		    System.out.println("\nPrint Set Value via Iterator: ");
 
		    for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext();) {
		      Object o = iterator.next();
		      System.out.print(o + " ");
		    }
	}
}
