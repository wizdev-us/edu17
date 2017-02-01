package albert.module10;

import java.io.*;

public class FormattedMemoryInput {
	public static void main(String[] args) throws IOException {
		try {
			String file = "src\\albert\\module10\\FormattedMemoryInput.java";
			DataInputStream in = new DataInputStream(
					new ByteArrayInputStream(BufferedReaderFile.read(file).getBytes()));
			while (in.available() != 0)
				System.out.print((char) in.readByte());
		} catch (EOFException e) {
			System.err.println("End of stream");
		}
	}
}