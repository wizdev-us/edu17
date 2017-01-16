package albert.kang.module01;

import static albert.kang.utils.Print.*;

import java.util.ArrayList;
import java.util.List;

class Glyph {
	void draw() {
		print("Glyph.draw()");
	}

	Glyph() {
		print("Glyph() before draw()");
		draw();
		print("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;

	RoundGlyph(int r) {
		radius = r;
		print("RoundGlyph.RoundGlyph(), radius = " + radius);
	}

	void draw() {
		print("RoundGlyph.draw(), radius = " + radius);
	}
}

public abstract class PolyConstructors {
	public static void main(String[] args) {
		new RoundGlyph(5);

	}

} /*
	 * Output: Glyph() before draw() RoundGlyph.draw(), radius = 0 Glyph() after
	 * draw() RoundGlyph.RoundGlyph(), radius = 5
	 */// :~
