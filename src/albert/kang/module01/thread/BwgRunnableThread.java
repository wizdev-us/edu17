package albert.kang.module01.thread;

public class BwgRunnableThread {

	public static void main(String[] args) {

		Runnable thread = new Runnable() {
			public void run() {
				int i = 0;
				while (true) {
					System.out.println("Thread started... Counter ==> " + i++);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};

		new Thread(thread).start();;
		System.out.println("Main() Program Exited...\n");
	}
}