package albert.module01;

import java.io.File;
import albert.util.BinaryFile;

public class HexViewer {

	public static void main(String[] args) throws Exception {
		if (args.length == 0) {
			System.out.println(format(BinaryFile.read("bin\\albert\\module01\\HelloWorld.class")));
		} else {
			System.out.println(format(BinaryFile.read(new File(args[0]))));
		}
	}

	public static String format(byte[] data) {
		StringBuilder result = new StringBuilder();
		int n = 0;
		for (byte b : data) {
			if (n % 16 == 0) {
				result.append(String.format("%05X: ", n));
			}
			result.append(String.format("%02X ", b));
			n++;
			if (n % 16 == 0) {
				result.append("\n");
			}
		}
		result.append("\n");
		return result.toString();
	}
}