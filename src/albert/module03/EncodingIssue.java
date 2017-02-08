package albert.module03;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class EncodingIssue {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String message = "안녕하세요.";
		System.out.println("message = " + message + "\n");

		System.out.println(">>> defautlcharset = " + Charset.defaultCharset());
		System.out.println("message.getBytes() - EUC-KR = " + new String(message.getBytes(), "EUC-KR"));
		System.out.println("message.getBytes() - UTF-8 = " + new String(message.getBytes(), "UTF-8") + "\n");

		byte[] utf8 = message.getBytes("UTF-8");
		byte[] utf16 = message.getBytes("UTF-16BE");
		byte[] euckr = message.getBytes("EUC-KR");

		System.out.println(">>> UTF-8  byte length = " + utf8.length);
		System.out.println(">>> UTF-16 byte length = " + utf16.length);
		System.out.println(">>> EUC-KR byte length = " + euckr.length);

		System.out.println("UTF-8 Encoding byte[] - EUC-KR = " + new String(utf8, "EUC-KR"));
		System.out.println("UTF-8 Encoding byte[] - UTF-8 = " + new String(utf8, "UTF-8"));
	}
}