package albert.kang.module04;

import java.util.Timer;
import java.util.TimerTask;
 
/**
 * @author Crunchify
 */
 
public class CrunchifyTimerExample {
	Timer timer;
 
	public static void main(String[] args) {
		System.out.println("Started Timer Example. Now wait for 10 sec.");
		new CrunchifyTimerExample(10);
		System.out.println("NOTE: This println executed before Timer.");
	}
 
	public CrunchifyTimerExample(int seconds) {
		Timer timer = new Timer();
		//Scheduling NextTask() call in 10 second. 
		timer.schedule(new NextTask(), seconds * 1000);		
	}
 
	class NextTask extends TimerTask {
		@Override
		public void run() {
			System.out.println("Terminated the Timer Thread!");
			timer.cancel(); // Terminate the thread
		}
	}
}
