package albert.module09;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {

		HashSet<Item> items = new HashSet<>();

		items.add(new Item(1));
		items.add(new Item(3));
		items.add(new Item(2));
		items.add(new Item(5));
		items.add(new Item(4));
		items.add(new Item(5));

		Iterator<Item> it = items.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		HashSet<Integer> numbers = new HashSet<>();

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

class Item {

	int num;

	public Item(int num) {
		super();
		this.num = num;
	}

	@Override
	public String toString() {
		return "Item [num=" + num + "]";
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this.num == ((Item) obj).num)
//			return true;
//		else
//			return false;
//	}

//	@Override
//    public int hashCode(){
//        return num;
//    }
}