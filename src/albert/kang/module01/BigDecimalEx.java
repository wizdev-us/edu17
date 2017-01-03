package albert.kang.module01;

import java.math.BigDecimal;

public class BigDecimalEx {
	
	
	public static void main(String[] args){
		
		BigDecimal num1 = new BigDecimal(1.2);
		BigDecimal num2 = new BigDecimal(0.2);
		
		System.out.println("sum = " + num1.add(num2));
		System.out.println("multiply = " + num1.multiply(num2));


		BigDecimal num3 = new BigDecimal("1.2");
		BigDecimal num4 = new BigDecimal("0.2");
		
		System.out.println("sum = " + num3.add(num4));
		System.out.println("multiply = " + num3.multiply(num4));
		
	}
}
