package albert.kang.module03;

import java.lang.reflect.Method;

/**
 * @author Crunchify.com
 * 
 */
 
public class CrunchifyReflectionExample {
 
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
 
		// no paramater
		Class<?> noparams[] = {};
 
		// String parameter
		Class[] paramString = new Class[1];
		paramString[0] = String.class;
 
		try {
 
			// Load CrunchifyReflectionTest Class at runtime
			Class<?> cls = Class.forName("albert.kang.module03.CrunchifyReflectionTest");
			Object obj = cls.newInstance();
 
			Method method = cls.getDeclaredMethod("getCompany", noparams);
			method.invoke(obj);
 
			method = cls.getDeclaredMethod("getCompanyName", paramString);
			method.invoke(obj, new String("Google"));
 
			method = cls.getDeclaredMethod("getCompanyPhone", paramString);
			method.invoke(obj, new String("408.111.1111"));
 
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}



class CrunchifyReflectionTest {
	 
	public void getCompany() {
		System.out.println("getCompany(): Value => no param");
	}
 
	public void getCompanyName(String companyName) {
		System.out.println("getCompanyName(): Value => " + companyName);
	}
 
	public void getCompanyPhone(String companyPhone) {
		System.out.println("getCompanyPhone(): Value => " + companyPhone);
	}
 
}
