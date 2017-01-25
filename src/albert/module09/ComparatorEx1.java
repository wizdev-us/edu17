package albert.module09;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.Comparator;

public class ComparatorEx1 {

	public static void main(String[] args) {
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());

		treeSet.add(new Fruit("Grape", 4000));
		treeSet.add(new Fruit("Apple", 10000));
		treeSet.add(new Fruit("Banana", 50000));
		treeSet.add(new Fruit("Pineapple", 2000));

		Iterator<Fruit> it = treeSet.iterator();

		while (it.hasNext()) {
			Fruit fruit = it.next();
			System.out.println(fruit.name + " : " + fruit.price);
		}
	}

}

class DescendingComparator implements Comparator<Fruit> {
	@Override
	public int compare(Fruit f1, Fruit f2) {
		if (f1.price < f2.price)
			return 1;
		else if (f1.price == f2.price)
			return 0;
		else
			return -1;
	}

}

class Fruit {
	public String name;
	public int price;

	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

}
