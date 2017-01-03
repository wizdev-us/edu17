package albert.kang.module02.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableEx1 {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();

		map.put("ABC", "123");
		map.put("DEF", "456");
		map.put("GHI", "789");

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디: ");
			String id = scan.nextLine();

			System.out.print("비밀번호: ");
			String pwd = scan.nextLine();
			System.out.println();

			if (map.containsKey(id)) {
				if (map.get(id).equals(pwd)) {
					System.out.println("로그인되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}

		scan.close();
	}

}
