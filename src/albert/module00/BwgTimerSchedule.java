package albert.module00;

import java.util.Timer;
import java.util.TimerTask;

public class BwgTimerSchedule {
	Timer timer;

	public BwgTimerSchedule() {
		timer = new Timer();
		timer.schedule(new RemindTask(), 3000);
	}

	class RemindTask extends TimerTask {

		public void run() {
			System.out.format("RemindTask Done..!");
			timer.cancel();
		}
	}

	public static void main(String args[]) {
		new BwgTimerSchedule();
		System.out.format("Task scheduled..!%n \n");
	}
}
