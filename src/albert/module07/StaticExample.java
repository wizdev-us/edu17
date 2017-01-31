package albert.module07;

public class StaticExample {

	public static void main(String[] args) {
		StaticDeclaration.setTestValue(5);

		// non-private static variables can be accessed with class name
		StaticDeclaration.testString = "\nAssigning testString a value";
		StaticDeclaration csd = new StaticDeclaration();
		System.out.println(csd.getTestString());

		// class and instance static variables are same
		System.out.print("\nCheck if Class and Instance Static Variables are same:  ");
		System.out.println(StaticDeclaration.testString == csd.testString);
		System.out.println("Why? Because: StaticDeclaration.testString == csd.testString");
	}
}

class StaticDeclaration {
	static {
		System.out.println("\nI'm static block 1..");
		setTestString("This is static block's String");
		setTestValue(2);
	}

	static {
		System.out.println("\nI'm static block 2..");
	}

	private static int testValue;

	public int getTestValue() {
		return testValue;
	}

	public static void setTestValue(int testValue) {
		if (testValue > 0)
			StaticDeclaration.testValue = testValue;
		System.out.println("setTestValue method: " + testValue);
	}

	public static String testString;

	public static String getTestString() {
		return testString;
	}

	public static void setTestString(String testString) {
		StaticDeclaration.testString = testString;
		System.out.println("setTestString method: " + testString);
	}

	public static int subValue(int i, int... js) {
		int sum = i;
		for (int x : js)
			sum -= x;
		return sum;
	}
}