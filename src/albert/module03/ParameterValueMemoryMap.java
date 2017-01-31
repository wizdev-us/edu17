package albert.module03;

class DataValue {
	int x;
}

public class ParameterValueMemoryMap {
	public static void main(String[] args) {

		DataValue d = new DataValue();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d.x);

		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}

	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}
