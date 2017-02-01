package albert.module10;

import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {
	public static void main(String[] args) throws IOException {
		StringReader in = new StringReader(BufferedReaderFile.read("src\\albert\\module10\\MemoryInput.java"));

		int c;
		while ((c = in.read()) != -1)
			System.out.print((char) c);
	}
}