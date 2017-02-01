package albert.module09;

import java.util.*;

class QuizPriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<ToDoItem> pq = new PriorityQueue<>();

		pq.add(new ToDoItem("Empty trash", 4));
		pq.add(new ToDoItem("Feed dog", 2));
		pq.add(new ToDoItem("Feed bird", 5));
		pq.add(new ToDoItem("Mow lawn", 3));
		pq.add(new ToDoItem("Water lawn", 1));
		pq.add(new ToDoItem("Feed cat", 6));

		while (!pq.isEmpty()) {
			System.out.println(pq.remove());
		}
	}
}

class ToDoItem implements Comparable<ToDoItem> {
	private int priority;
	private String item;

	public ToDoItem(String td, int pri) {
		priority = pri;
		item = td;
	}

	public String toString() {
		return priority + ": " + item;
	}

	public int compareTo(ToDoItem arg) {
		return 0;
	}
}

// class ToDoItem implements Comparable<ToDoItem> {
// private int priority;
// private String item;
//
// public ToDoItem(String td, int pri) {
// priority = pri;
// item = td;
// }
//
// public String toString() {
// return priority + ": " + item;
// }
//
// public int compareTo(ToDoItem arg) {
// if (priority > arg.priority)
// return 1;
// if (priority < arg.priority)
// return -1;
// return 0;
// }
// }
