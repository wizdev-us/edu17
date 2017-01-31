package albert.module06;

public class ObjectOverriding {

	public static void main(String args[]) {
		Company a = new Company();
		Company b = new eBay();

		a.address();
		b.address();
	}
}

class Company {
	public void address() {
		System.out.println("This is Address of BwG Company...");
	}
}

class eBay extends Company {
	public void address() {
		super.address(); // invokes the super class method
		System.out.println("This is eBay's Address...");
	}
}