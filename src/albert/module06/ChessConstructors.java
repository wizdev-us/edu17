package albert.module06;

class Game {
	Game(int i) {
		System.out.println("Game constructor");
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		System.out.println("BoardGame constructor");
	}
}

public class ChessConstructors extends BoardGame {
	ChessConstructors() {
		super(11);
		System.out.println("Chess constructor");
	}

	public static void main(String[] args) {
		ChessConstructors x = new ChessConstructors();
	}
}