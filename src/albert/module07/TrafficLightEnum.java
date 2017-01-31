package albert.module07;

enum Signal {
	GREEN, YELLOW, RED,
}

public class TrafficLightEnum {
	Signal color = Signal.RED;

	public void change() {
		switch (color) {
		case RED:
			color = Signal.GREEN;
			break;
		case GREEN:
			color = Signal.YELLOW;
			break;
		case YELLOW:
			color = Signal.RED;
			break;
		}
	}

	public String toString() {
		return "The traffic light is " + color;
	}

	public static void main(String[] args) {
		TrafficLightEnum t = new TrafficLightEnum();
		for (int i = 0; i < 7; i++) {
			System.out.println(t);
			t.change();
		}
	}
}