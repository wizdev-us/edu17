package albert.kang.module02.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();

		set.add(new Member("Jackie", 22));
		set.add(new Member("Jackie", 22));
		set.add(new Member("Hong", 24));
		set.add(new Member("Andy", 32));
		set.add(new Member("Jolie", 29));

		System.out.println("총 객체 수: " + set.size());

		Iterator<Member> it = set.iterator();

		while (it.hasNext()) {
			Member mem = it.next();
			System.out.println("\t" + mem.name + " - " + mem.age);
		}
	}

}

class Member {
	public String name;
	public int age;

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

}
