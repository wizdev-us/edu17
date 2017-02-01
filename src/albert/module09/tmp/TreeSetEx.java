package albert.module09.tmp;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {

		TreeSet<TreeItem> items = new TreeSet<>();

		items.add(new TreeItem(1));
		items.add(new TreeItem(3));
		items.add(new TreeItem(2));
		items.add(new TreeItem(5));
		items.add(new TreeItem(4));
		items.add(new TreeItem(5));

		Iterator<TreeItem> it = items.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		TreeSet<Integer> numbers = new TreeSet<>();

		numbers.add(1);
		numbers.add(3);
		numbers.add(2);
		numbers.add(5);
		numbers.add(4);
		numbers.add(5);

		Iterator<Integer> it2 = numbers.iterator();

		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
	}

}

class TreeItem implements Comparable<TreeItem> {

	int num;

	public TreeItem(int num) {
		super();
		this.num = num;
	}

	@Override
	public String toString() {
		return "Item [num=" + num + "]";
	}

	@Override
	public int compareTo(TreeItem o) {
		if (num == o.num)
			return 0;
		
		if (num > o.num)
			return 1;
		else 
			return -1;
	}
}