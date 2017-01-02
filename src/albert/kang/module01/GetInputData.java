package albert.kang.module01;

import java.util.Scanner;

class GetInputData {
	public static void main(String args[]) {
		int num;
		String str;

		Scanner in = new Scanner(System.in);

		//Get input String
		System.out.println("Enter a string: ");
		str = in.nextLine();
		System.out.println("Input String is: " + str);

		//Get input Integer
		System.out.println("Enter an integer: ");
		num = in.nextInt();
		System.out.println("Input Integer is: " + num);
	}
}
