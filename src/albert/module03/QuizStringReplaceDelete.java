package albert.module03;

public class QuizStringReplaceDelete {

	public static void main(String[] args) {
		System.out.println("removeChar() " + removeChar("BankwareGlobal.com", 'a'));
		System.out.println("replaceCharAt() " + replaceCharAt("BankwareGlobal.com", 10, '$'));
		System.out.println("deleteAllNonDigit() " + deleteAllNonDigit("#2xzs1dxfs23$&%^(!9@!"));
		System.out.println("replaceAllChar() " + replaceAllChar("BankwareGlobal.com", "a", "*"));
		System.out.println("removeCharAt() " + removeCharAt("BankwareGlobal.com", 5));
	}

	
//	removeChar() BnkwreGlobl.com	
//	replaceCharAt() BankwareGl$bal.com	
//	deleteAllNonDigit() 21239	
//	replaceAllChar() B*nkw*reGlob*l.com	
//	removeCharAt() BankwreGlobal.com	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	private static String removeCharAt(String s, int i) {
		StringBuilder buf = new StringBuilder(s.length() - 1);
		buf.append(s.substring(0, i)).append(s.substring(i + 1));
		return buf.toString();
	}

	private static String removeChar(String s, char c) {
		StringBuilder buf = new StringBuilder(s.length());
		buf.setLength(s.length());
		int current = 0;
		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if (cur != c)
				buf.setCharAt(current++, cur);
		}
		return buf.toString();
	}

	private static String replaceCharAt(String s, int i, char c) {
		StringBuilder buf = new StringBuilder(s);
		buf.setCharAt(i, c);
		return buf.toString();
	}

	private static String deleteAllNonDigit(String s) {
		String temp = s.replaceAll("\\D", "");
		return temp;
	}

	public static String replaceAllChar(String s, String f, String r) {
		String temp = s.replace(f, r);
		return temp;
	}
}
