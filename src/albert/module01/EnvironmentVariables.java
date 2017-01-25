package albert.module01;

//: holding/EnvironmentVariables.java
import java.util.*;

public class EnvironmentVariables {
	public static void main(String[] args) {
		for (Map.Entry entry : System.getenv().entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		System.out.println("myclasspath = " + System.getenv().get("CLASSPATH"));
	}
}