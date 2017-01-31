package albert.module08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowThrows {

	@SuppressWarnings("unused")
	public static void main(String args[]) throws Exception {
		FileInputStream stream01 = null;
		FileInputStream stream02 = null;
		String fileName = "tmp.txt";

		System.out.println("main: Starting " + ThrowThrows.class.getName() + " with file name = " + fileName);

		try {
			stream01 = test01(fileName);
		} catch (FileNotFoundException ex) {
			System.out.println("main: Oops, FileNotFoundException caught");
		} catch (Exception ex) {
			System.out.println("main: Oops, genreal exception caught");
		}

		stream02 = test02(fileName);
		System.out.println("main: " + ThrowThrows.class.getName() + " ended");
	}

	public static FileInputStream test01(String fileName) throws FileNotFoundException {
		FileInputStream crunchifyStream = new FileInputStream(fileName);
		System.out.println("test01: File input stream created");
		return crunchifyStream;
	}

	public static FileInputStream test02(String fileName) throws Exception {
		FileInputStream stream = null;
		try {
			stream = new FileInputStream(fileName);
		} catch (FileNotFoundException ex) {
			throw new Exception("crunchifyTest2: Oops, FileNotFoundException caught");
			// System.out.println("crunchifyTest2: Oops, FileNotFoundException
			// caught");
		} finally {
			System.out.println("test02: finally block");
		}
		System.out.println("test02: Returning from test02");
		return stream;
	}

}
