package albert.module09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuizSublist {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		List<Integer> subList = list.subList(0, 3);
		System.out.println("list : " + list);
		System.out.println("sublist : " + subList);
		list.remove(0);
		System.out.println("list : " + list);
		System.out.println("sublist : " + subList);
	}

}
//list : [1, 2, 3, 4, 5, 6, 7, 8, 9]
//sublist : [1, 2, 3]
//list : [2, 3, 4, 5, 6, 7, 8, 9]
//sublist : [1, 2, 3]

















//		List<Integer> subList = new ArrayList<>(list.subList(0, 3));