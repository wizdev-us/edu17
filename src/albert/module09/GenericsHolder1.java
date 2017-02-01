package albert.module09;

class Automobile {
}

public class GenericsHolder1 {
	private Automobile a;

	public GenericsHolder1(Automobile a) {
		this.a = a;
	}

	Automobile get() {
		return a;
	}
}