package albert.kang.module00;

import java.util.*;

// 문제 해결

public class FailFast {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		for (String s : list) {
			if (s.equals("B")) {
				list.remove("B");
			}
		}
		System.out.println(list);
	}
}
// [A, C, D, E]


// Iterator<String> iter = list.iterator();
// while (iter.hasNext()) {
// String str = iter.next();
// if (str.equals("B")) {
// iter.remove();
// }
// }
// System.out.println(list);