package albert.module09;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx1 {

	public static void main(String[] args) {
		List<String> arrList = new ArrayList<String>();
		List<String> linkedList = new LinkedList<String>();

		long startTime;
		long endTime;
		long runTime;

		startTime = System.nanoTime();

		for (int i = 0; i < 10000; i++) {
			arrList.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();

		runTime = endTime - startTime;

		System.out.println("ArrayList 걸린시간: " + runTime + " ns");

		startTime = System.nanoTime();

		for (int i = 0; i < 10000; i++) {
			linkedList.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();

		runTime = endTime - startTime;

		System.out.println("LinkedList 걸린시간: " + runTime + " ns");
	}

}