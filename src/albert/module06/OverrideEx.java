package albert.module06;

class Human {
	public void eat() {
		System.out.println("Human is eating");
	}
}

class OverrideEx extends Human {

	@Override
	public void eat() {
		System.out.println("Boy is eating");
	}

	public void move() {
		System.out.println("Boy is moving");
		eat();
		this.eat();
		super.eat();
	}

	public static void main(String args[]) {
		OverrideEx obj = new OverrideEx();
		obj.eat();
		obj.move();
	}
}
