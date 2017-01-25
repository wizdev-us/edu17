package albert.module03;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
/**
 * @author Crunchify.com
 *
 */
public class CrunchifyPasswordVerification {
	public static void main(String[] args) {
 
		String pattern = "((?=.*[@!#$%])(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,22})";
		Pattern r = Pattern.compile(pattern);
 
		List<String> input = new ArrayList<String>();
		input.add("Crunchify");
		input.add("Crunchify123#");
		input.add("crunchify123#");
		input.add("crunchify** ");
		input.add("Crunchify123!!");
 
		for (String password : input) {
			Matcher m = r.matcher(password);
			if (m.matches())
				System.out.println("Password: " + password + " is valid");
			else
				System.out.println("Password: " + password + " is NOT valid");
		}
 
	}
}
