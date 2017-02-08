package albert.module03;

public class ThisReference {
	int i = 0;

	ThisReference increase() {
		i++;
		return this;
	}

	ThisReference decrease() {
		i--;
		return this;
	}

	void print() {
		System.out.println("i = " + i);
	}

	public static void main(String[] args) {
		ThisReference x = new ThisReference();
		x.increase().increase().increase().decrease().print();
	}
}