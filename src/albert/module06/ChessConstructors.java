package albert.module06;

import static albert.util.Print.*;

class Game {
	Game(int i) {
		print("Game constructor");
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		print("BoardGame constructor");
	}
}

public class ChessConstructors extends BoardGame {
	ChessConstructors() {
		super(11);
		print("Chess constructor");
	}

	public static void main(String[] args) {
		ChessConstructors x = new ChessConstructors();
	}
}