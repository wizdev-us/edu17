package albert.module00;

/**
 * @author Crunchify.com
 */

// Simple Test client program that uses above factory pattern implementation.

public class CrunchifyFactoryPatternTest {

	public static void main(String[] args) {
		CrunchfiyCompany eBay = CrunchifyFactoryPattern.getDetails("Ebay", "408.123.4567", "98765");
		CrunchfiyCompany google = CrunchifyFactoryPattern.getDetails("Google", "519.123.4567", "56789");
		System.out.println("Factory eBay Config::" + eBay);
		System.out.println("Factory Google Config::" + google);
	}
}

// Now that we have super classes and sub-classes ready, we can write our
// factory class.
// We can keep Factory class Singleton or we can keep the method that return the
// subclass a static.
// Notice that based on the input parameter, different subclass is created and
// returned.

class CrunchifyFactoryPattern {

	public static CrunchfiyCompany getDetails(String type, String phoneNumber, String zipCode) {
		if ("Ebay".equalsIgnoreCase(type))
			return new CrunchifyEbay(phoneNumber, zipCode);
		else if ("Google".equalsIgnoreCase(type))
			return new CrunchifyGoogle(phoneNumber, zipCode);

		return null;
	}

}

abstract class CrunchfiyCompany {

	public abstract String getPhoneNumber();

	public abstract String getZipCode();

	@Override
	public String toString() {
		return "Phone #= " + this.getPhoneNumber() + ", Zip Code= " + this.getZipCode();
	}
}

class CrunchifyEbay extends CrunchfiyCompany {

	private String phoneNumber;
	private String zipCode;

	public CrunchifyEbay(String phoneNumber, String zipCode) {
		this.phoneNumber = phoneNumber;
		this.zipCode = zipCode;
	}

	@Override
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	@Override
	public String getZipCode() {
		return this.zipCode;
	}
}

class CrunchifyGoogle extends CrunchfiyCompany {

	private String phoneNumber;
	private String zipCode;

	public CrunchifyGoogle(String phoneNumber, String zipCode) {
		this.phoneNumber = phoneNumber;
		this.zipCode = zipCode;
	}

	@Override
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	@Override
	public String getZipCode() {
		return this.zipCode;
	}
}
