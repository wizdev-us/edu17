package albert.kang.module01.thread;

import java.util.Iterator;
import java.util.Vector;

public class QuizProducerConsumer {
	private static Vector<Object> buffer = new Vector<Object>();

	public static void main(String[] args) {
		new Producer().start();
		new Consumer().start();
	}

	static class Consumer extends Thread {
		@Override
		public void run() {
			while (true) {
				Iterator<Object> it = buffer.iterator();
				while (it.hasNext()) {
					System.out.println(it.next());
				}

			}
		}
	}

	static class Producer extends Thread {
		@Override
		public void run() {
			while (true) {
				buffer.add(new Object());
				if (buffer.size() > 10) {
					buffer.remove(buffer.size() - 1);
				}

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}