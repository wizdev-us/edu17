package albert.kang.module03;

public class CrunchifyRunnableThread {
	 
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			public void run() {
				boolean flag = true;	
				int i = 0;
				while(flag){
					i++;
					System.out.println("Thread started... Counter ==> " + i);	
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
 
		Thread t = new Thread(r);
		// Lets run Thread in background..
		// Sometimes you need to run thread in background for your Timer application..
		t.start(); // starts thread in background..
		// t.run(); // is going to execute the code in the thread's run method on the current thread..
		System.out.println("Main() Program Exited...\n");
	}
}
