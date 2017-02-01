package albert.module10;

import java.io.*;
import java.util.*;

class Data implements Serializable {
	private int n;

	public Data(int n) {
		this.n = n;
	}

	public String toString() {
		return Integer.toString(n);
	}
}

public class SerializableEx implements Serializable {
	private static Random rand = new Random(47);
	private Data[] d = { new Data(rand.nextInt(10)), new Data(rand.nextInt(10)), new Data(rand.nextInt(10)) };
	private SerializableEx next;
	private char c;

	// Value of i == number of segments
	public SerializableEx(int i, char x) {
		System.out.println("Worm constructor: " + i);
		c = x;
		if (--i > 0)
			next = new SerializableEx(i, (char) (x + 1));
	}

	public SerializableEx() {
		System.out.println("Default constructor");
	}

	public String toString() {
		StringBuilder result = new StringBuilder(":");
		result.append(c);
		result.append("(");
		for (Data dat : d)
			result.append(dat);
		result.append(")");
		if (next != null)
			result.append(next);
		return result.toString();
	}

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		SerializableEx w = new SerializableEx(6, 'a');
		System.out.println("w = " + w);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("worm.out"));
		out.writeObject("Worm storage\n");
		out.writeObject(w);
		out.close(); // Also flushes output
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("worm.out"));
		String s = (String) in.readObject();
		SerializableEx w2 = (SerializableEx) in.readObject();
		System.out.println(s + "w2 = " + w2);
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		ObjectOutputStream out2 = new ObjectOutputStream(bout);
		out2.writeObject("Worm storage\n");
		out2.writeObject(w);
		out2.flush();
		ObjectInputStream in2 = new ObjectInputStream(new ByteArrayInputStream(bout.toByteArray()));
		s = (String) in2.readObject();
		SerializableEx w3 = (SerializableEx) in2.readObject();
		System.out.println(s + "w3 = " + w3);
	}
}
