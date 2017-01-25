package albert.module09;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableEx1 {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();

		treeSet.add(new Person("Jackie", 44));
		treeSet.add(new Person("Jolie", 24));
		treeSet.add(new Person("Mike", 32));

		Iterator<Person> it = treeSet.iterator();

		while (it.hasNext()) {
			Person person = it.next();
			System.out.println(person.name + "-" + person.age);
		}
	}

}

class Person implements Comparable<Person> {

	public String name;
	public int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person person) {
		if (age < person.age)
			return -1;
		else if (age == person.age)
			return 0;
		else
			return 1;
	}

}