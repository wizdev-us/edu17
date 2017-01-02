package albert.kang.module01;
import java.io.UnsupportedEncodingException;

public class EncodingEx {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String message = "안녕하세요.";

		byte[] utf8 = message.getBytes("UTF-8");
		byte[] utf16 = message.getBytes("UTF-16BE");
		byte[] uni = message.getBytes();

		System.out.println("8 byte length > " + utf8.length);
		System.out.println("16 byte length > " + utf16.length);
		System.out.println("unicode byte length > " + uni.length);

		System.out.println("file.encoding = " + System.getProperty("file.encoding"));
	}

}
