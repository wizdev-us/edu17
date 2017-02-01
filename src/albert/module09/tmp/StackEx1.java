package albert.module09.tmp;

import java.util.Stack;

public class StackEx1 {

	public static void main(String[] args) {
		Stack<Coin> stack = new Stack<Coin>();

		stack.push(new Coin(100));
		stack.push(new Coin(50));
		stack.push(new Coin(500));
		stack.push(new Coin(100));
		stack.push(new Coin(50));
		stack.push(new Coin(50));
		stack.push(new Coin(500));

		while (!stack.isEmpty()) {
			Coin coin = stack.pop();
			System.out.println("꺼낸 동전: " + coin.getValue() + " 원");
		}
	}

}

class Coin {
	private int value;

	public Coin(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
