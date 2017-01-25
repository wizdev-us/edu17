package albert.module12;

public class BwgDaemonThread extends Thread {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Main Method Entry");
		BwgDaemonThread thread = new BwgDaemonThread();

		// thread.setDaemon(true);

		thread.start();
		Thread.sleep(3000);
		System.out.println("Main Method Exit");
	}

	public void run() {
		System.out.println("run Method Entry");

		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("In run method.." + Thread.currentThread());
		}
	}
}