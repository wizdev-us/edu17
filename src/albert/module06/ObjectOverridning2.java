package albert.module06;

class Human {
	public void eat() {
		System.out.println("Human is eating");
	}
}

class ObjectOverridning2 extends Human {
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
		ObjectOverridning2 obj = new ObjectOverridning2();
		obj.eat();
		obj.move();
	}
}