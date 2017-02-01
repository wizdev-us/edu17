package albert.module10;

import java.io.*;

public class BasicFileOutput {

	public static void main(String[] args) throws IOException {
		String fileName = "src\\albert\\module10\\BasicFileOutput.java";
		String outFile = "BasicFileOutput.out";

		BufferedReader in = new BufferedReader(new StringReader(BufferedReaderFile.read(fileName)));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(outFile)));
		int lineCount = 1;
		String s;
		while ((s = in.readLine()) != null)
			out.println(lineCount++ + ": " + s);
		out.close();
		// Show the stored file:
		System.out.println(BufferedReaderFile.read(outFile));
	}
}
