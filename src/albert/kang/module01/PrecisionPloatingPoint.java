package albert.kang.module01;

import java.io.UnsupportedEncodingException;

public class PrecisionPloatingPoint {

	public static void main(String[] args) throws UnsupportedEncodingException {

		float num1 = 1.0001F;
		float num2 = 1.00001F;

		float sum = num1 + num2;

		System.out.println("sum = " + sum);
	}
}
