package albert.module09;

public class GenericsHolder3<T> {
	private T a;

	public GenericsHolder3(T a) {
		this.a = a;
	}

	public void set(T a) {
		this.a = a;
	}

	public T get() {
		return a;
	}

	public static void main(String[] args) {
		GenericsHolder3<Automobile> h3 = new GenericsHolder3<Automobile>(new Automobile());
		Automobile a = h3.get(); // No cast needed
		// h3.set("Not an Automobile"); // Error
		// h3.set(1); // Error
	}
}
