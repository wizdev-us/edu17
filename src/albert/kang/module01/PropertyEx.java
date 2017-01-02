package albert.kang.module01;

import java.io.UnsupportedEncodingException;

public class PropertyEx {

	public static void main(String[] args) throws UnsupportedEncodingException {

		System.out.println(System.getProperty("file.encoding"));

		System.setProperty("MY_PROPERTY", "ValueX");

		System.getProperties().list(System.out);

		System.out.println(System.getProperty("MY_PROPERTY"));
	}
}
