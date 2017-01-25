package albert.module00;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import albert.module00.CrunchifyObject.Employee;

public class CrunchifyObjectTest {

	static CrunchifySingleton instance = CrunchifySingleton.getCrunchifySingletonInstance();

	public static void main(String[] args) throws JSONException {
		populateAndSaveDataFromSingletonObject();
		retrieveDataFromSingletonObject();
	}

	private static void retrieveDataFromSingletonObject() throws JSONException {
		String result = instance.getCrunchifyObject();
		System.out.println(result);
	}

	private static void populateAndSaveDataFromSingletonObject() {

		// Create CrunchifyObject
		CrunchifyObject crunchifyObj = new CrunchifyObject();
		crunchifyObj.setName("Crunchify.com");
		crunchifyObj.setAddress("NYC - US");

		// Create Employee1
		Employee emp1 = crunchifyObj.new Employee();
		emp1.setFirstName("Mike");
		emp1.setLastName("Rose");
		emp1.setPhoneNumber(1222222222);

		// Create Employee2
		Employee emp2 = crunchifyObj.new Employee();
		emp2.setFirstName("app");
		emp2.setLastName("shah");
		emp2.setPhoneNumber(1333333333);

		// Create Employee3
		Employee emp3 = crunchifyObj.new Employee();
		emp3.setFirstName("Dexter");
		emp3.setLastName("My");
		emp3.setPhoneNumber(1444444444);

		// Add all Employee Object to CrunchifySingleton object
		instance.addEmployee(emp1);
		instance.addEmployee(emp2);
		instance.addEmployee(emp3);

		// Add Employees to CrunchifyObject
		crunchifyObj.setEmployees(instance.getEmployee());

		// Now finally add CrunchifyObject to same CrunchifySingleton object
		// which will use to retrieve all data
		instance.addCrunchify(crunchifyObj);
	}

}

/**
 * @author Crunchify.com This is Singleton class used to access from any where
 *         from your project. Here we are using it from CrunchifyObjectTest.java
 *
 */
class CrunchifySingleton {

	private List<Employee> employees = new ArrayList<Employee>();
	private static CrunchifySingleton singletonInstance = null;
	private CrunchifyObject crunchify = new CrunchifyObject();

	public static CrunchifySingleton getCrunchifySingletonInstance() {
		if (singletonInstance == null) {
			singletonInstance = new CrunchifySingleton();
		}
		return singletonInstance;
	}

	public void addEmployee(Employee employee) {
		synchronized (employees) {
			employees.add(employee);
		}
	}

	public List<Employee> getEmployee() {
		return employees;
	}

	public void addCrunchify(CrunchifyObject crunchify) {
		synchronized (crunchify) {
			this.crunchify = crunchify;
		}
	}

	public String getCrunchifyObject() throws JSONException {
		JSONObject obj = new JSONObject();
		obj.put("name", crunchify.getName());
		obj.put("address", crunchify.getAddress());

		JSONArray employeeJson = new JSONArray();
		for (Employee emp : employees) {

			Map<String, String> employeeData = new HashMap<String, String>();
			employeeData.put("firstName", emp.getFirstName());
			employeeData.put("lastName", emp.getLastName());
			employeeData.put("phoneNumber", emp.getPhoneNumber() + "");

			employeeJson.put(employeeData);
		}
		obj.put("employees", employeeJson);
		return obj.toString();
	}
}

class CrunchifyObject {
	public String name;
	public String address;
	public List<Employee> employees;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	// Class Employee
	public class Employee {
		public String firstName;
		public String lastName;
		public int phoneNumber;

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public int getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
	}
}
