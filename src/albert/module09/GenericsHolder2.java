package albert.module09;

public class GenericsHolder2 {
	private Object a;

	public GenericsHolder2(Object a) {
		this.a = a;
	}

	public void set(Object a) {
		this.a = a;
	}

	public Object get() {
		return a;
	}

	public static void main(String[] args) {
		GenericsHolder2 h2 = new GenericsHolder2(new Automobile());
		Automobile a = (Automobile) h2.get();

		h2.set("Not an Automobile");
		String s = (String) h2.get();

		h2.set(1);
		Integer x = (Integer) h2.get();
	}
}
