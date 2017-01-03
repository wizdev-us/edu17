package albert.kang.module01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
/**
 * @author Crunchify.com
 *
 */
 
public class CrunchifyRegexTutorial {
 
	public static void main(String[] args) {
		crunchifyLoadAndAverageRegex();
		System.out.println("\n==========================\n");
 
		crunchifyFindUrlPattern();
		System.out.println("\n==========================\n");
 
		crunchifyFindIPMatcher();
		System.out.println("\n==========================\n");
 
		crunchifyRegexReplaceAllExample();
		System.out.println("\n==========================\n");
 
		crunchifyValidateSSN();
	}
 
	// Find if SSN is valid
	private static void crunchifyValidateSSN() {
		String ssn1 = "123-45-6789";
		String ssn2 = "123-456-789";
		String pattern = "^(\\d{3}-?\\d{2}-?\\d{4})$";
 
		if (ssn1.matches(pattern)) {
			System.out.println("SSN " + ssn1 + " is valid");
		} else {
			System.out.println("SSN " + ssn1 + " is NOT valid");
		}
 
		if (ssn2.matches(pattern)) {
			System.out.println("SSN " + ssn2 + " is valid");
		} else {
			System.out.println("SSN " + ssn2 + " is NOT valid");
		}
 
	}
 
	// ReplaceAll() Example
	private static void crunchifyRegexReplaceAllExample() {
		String find = "Java";
		String line = "This is Crunchify.com Java Tutorial.";
		String replace = "Spring MVC";
 
		Pattern p = Pattern.compile(find);
		Matcher m = p.matcher(line);
 
		// This line will find "Java" and replace it with "Spring MVC"
		line = m.replaceAll(replace);
		System.out.println(line);
 
	}
 
	// Check if valid IP present
	private static void crunchifyFindIPMatcher() {
		Pattern validIPPattern = Pattern.compile("^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$");
		System.out.println("192.abc.0.1 : " + validIPPattern.matcher("192.abc.0.1").find());
		System.out.println("192.168.0.1 : " + validIPPattern.matcher("192.168.0.1").find());
	}
 
	// Check if URL ends with specific extension
	private static void crunchifyFindUrlPattern() {
		String pattern = ".*\\.(ico|jpg|png|gif|tif|bmp|JPG|PNG|GIF|TIF|BMP)";
		Pattern r = Pattern.compile(pattern);
 
		Matcher m = r.matcher("http://crunchify.com/favicon.ico");
		if (m.find()) {
			System.out.println("URL pattern found");
		} else {
			System.out.println("URL pattern doesn't found");
		}
 
	}
 
	// How to Parse "uptime" command result in Java
	public static void crunchifyLoadAndAverageRegex() {
		Pattern uptimePattern = Pattern.compile("^.*\\s+load\\s+average:\\s+([\\d\\.]+),\\s+([\\d\\.]+),\\s+([\\d\\.]+)$");
 
		String output = " 10:17:32 up 189 days, 18:49,  5 user,  load average: 2.07, 1.11, 1.16";
		Matcher m = uptimePattern.matcher(output);
 
		if (m.matches()) {
			final double crunchify1MinuteLoadAvg = Double.parseDouble(m.group(1));
			final double crunchify5eMinuteloadAvg = Double.parseDouble(m.group(2));
			final double crunchify15MinuteLoadAvg = Double.parseDouble(m.group(3));
 
			System.out.println("Load Average 1 min: " + crunchify1MinuteLoadAvg);
			System.out.println("Load Average 5 min: " + crunchify5eMinuteloadAvg);
			System.out.println("Load Average 15 min: " + crunchify15MinuteLoadAvg);
		} else {
			System.out.println("no matches found");
		}
 
	}
}
