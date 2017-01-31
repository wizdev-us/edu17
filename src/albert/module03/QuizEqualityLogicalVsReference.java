package albert.module03;

public class QuizEqualityLogicalVsReference {

	public static void main(String[] args) {
		String strA = new String("eBay");
		String strB = new String("eBay");
		String strC = new String("Paypal");
		String strD = strA;

		System.out.println("Reference Equality Result:");
		System.out.println(strA == strB);
		System.out.println(strA == strC);
		System.out.println(strA == strD);

		System.out.println("\nLogical Equality Result:");
		System.out.println(strA.equals(strB));
		System.out.println(strA.equals(strC));
		System.out.println(strA.equals(strD));
	}
}