package albert.module07;

import albert.util.Spiciness;

public class BurritoEnum {
	Spiciness degree;

	public BurritoEnum(Spiciness degree) {
		this.degree = degree;
	}

	public void describe() {
		System.out.print("This burrito is ");
		switch (degree) {
		case NOT:
			System.out.println("not spicy at all.");
			break;
		case MILD:
		case MEDIUM:
			System.out.println("a little hot.");
			break;
		case HOT:
		case FLAMING:
		default:
			System.out.println("maybe too hot.");
		}
	}

	public static void main(String[] args) {
		BurritoEnum plain = new BurritoEnum(Spiciness.NOT), 
				greenChile = new BurritoEnum(Spiciness.MEDIUM),
				jalapeno = new BurritoEnum(Spiciness.HOT);
		plain.describe();
		greenChile.describe();
		jalapeno.describe();
	}
}