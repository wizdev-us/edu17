package albert.kang.module01.datatype;

public class CrunchifyObjectOverriding2 {
	 
	public static void main(String args[]) {
		Company2 a = new Company2(); // Company reference and object
		Company2 b = new eBay2(); // Company reference but eBay object
 
		a.address();// runs the method in Company class
		b.address();// Runs the method in eBay class
	}
}
 
class Company2 {
 
	public void address() {
		System.out.println("This is Address of Crunchify Company...");
	}
}
 
class eBay2 extends Company2 {
 
	public void address() {
		super.address(); // invokes the super class method
		System.out.println("This is eBay's Address...");
	}
}
