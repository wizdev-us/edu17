package albert.module09;

import java.util.HashMap;
import java.util.Map;

public class QuizHashMapDuplication {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();

		map.put(new Student(1, "John"), 100);
		map.put(new Student(1, "John"), 200);
		map.put(new Student(1, "John"), 300);

		System.out.println("총 Entry 수: " + map.size());
	}

}

class Student {
	public int sno;
	public String name;

	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
}
	
	
	
	
	
	
	
	
	

//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof Student) {
//			Student std = (Student) obj;
//
//			return (sno == std.sno) && (name == std.name);
//		} else {
//			return false;
//		}
//	}
//
//	@Override
//	public int hashCode() {
//		return sno + name.hashCode();
//	}

