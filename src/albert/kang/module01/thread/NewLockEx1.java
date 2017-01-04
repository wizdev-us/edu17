package albert.kang.module01.thread;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class NewLockEx1 {
	public static void main(String[] args) {
		StringComm comm = new StringComm();
		StringReader r = new StringReader(comm);
		StringWriter w = new StringWriter(comm);

		r.start();
		w.start();

		try {
			r.join();
			w.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class StringComm {
	String newString;
	boolean isNewString = false;

	private final ReentrantLock entLock = new ReentrantLock();
	private final Condition readCond = entLock.newCondition();
	private final Condition writeCond = entLock.newCondition();

	public void setNewString(String news) {
		entLock.lock();
		try {
			if (isNewString) {
				writeCond.await();
			}

			newString = news;
			isNewString = true;
			readCond.signal();

		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			entLock.unlock();
		}
	}

	public String getNewString() {
		String reStr = null;

		entLock.lock();

		try {
			if (isNewString == false) {
				readCond.await();
			}

			reStr = newString;
			isNewString = false;
			writeCond.signal();

		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			entLock.unlock();
		}
		return reStr;

	}
}

class StringReader extends Thread {
	StringComm comm;

	public StringReader(StringComm comm) {
		this.comm = comm;
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		String readStr;

		for (int i = 0; i < 5; i++) {
			readStr = sc.nextLine();

			comm.setNewString(readStr);

		}
	}
}

class StringWriter extends Thread {
	StringComm comm;

	public StringWriter(StringComm comm) {
		this.comm = comm;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(">>" + comm.getNewString());
		}
	}
}