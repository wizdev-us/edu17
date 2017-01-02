package albert.kang.module01;

class Human {
	public void eat() {
		System.out.println("Human is eating");
	}
}

class Boy6 extends Human {

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
		Boy6 obj = new Boy6();
		obj.eat();
		obj.move();
	}
}
