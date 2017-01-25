package albert.module12;

public class BwgThreadDeadLock {

	public static void main(String[] args) throws InterruptedException {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();

		Thread bwgThread1 = new Thread(new BwgSynchronizeThread(obj1, obj2), "bwgThread1");
		Thread bwgThread2 = new Thread(new BwgSynchronizeThread(obj2, obj3), "bwgThread2");
		Thread bwgThread3 = new Thread(new BwgSynchronizeThread(obj3, obj1), "bwgThread3");

		bwgThread1.start();
		bwgThread2.start();
		bwgThread3.start();
	}
}

class BwgSynchronizeThread implements Runnable {
    private Object obj1;
    private Object obj2;
 
    public BwgSynchronizeThread(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
 
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (obj1) {
            System.out.println(name + " acquired lock on Object1: " + obj1);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
 
            synchronized (obj2) {
                System.out.println(name + " acquired lock on Object2: " + obj2);
            }
            System.out.println(name + " released lock on Object2: " + obj2);
        }
        System.out.println(name + " released lock on Object1: " + obj1);
        System.out.println(name + " Finished bwg Deadlock Test.");
    }
}
