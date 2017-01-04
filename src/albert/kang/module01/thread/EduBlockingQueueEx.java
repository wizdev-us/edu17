package albert.kang.module01.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class EduBlockingQueueEx {

	public static void main(String[] args) {

		BlockingQueue<EduMessage> blockingQueue = new ArrayBlockingQueue<>(30);

		for (int i = 0; i < 5; i++) {
			new Thread(new EduBlockingProducer(blockingQueue, i)).start();
			new Thread(new EduBlockingConsumer(blockingQueue, i)).start();
		}

		System.out.println("Let's get started. Producer / Consumer Test Started.\n");
	}
}

class EduMessage {
	private String EduMsg;

	public EduMessage(String string) {
		this.EduMsg = string;
	}

	public String getMsg() {
		return EduMsg;
	}
}

class EduBlockingProducer implements Runnable {

	private BlockingQueue<EduMessage> blockingQueue;
	private int sequence;

	public EduBlockingProducer(BlockingQueue<EduMessage> queue, int sequence) {
		this.blockingQueue = queue;
		this.sequence = sequence;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			EduMessage msg = new EduMessage("i'm msg " + i);
			try {
				Thread.sleep(10);
				blockingQueue.put(msg);
				System.out.printf("EduBlockingProducer#%d : Message - %s produced. \n", sequence, msg.getMsg());

			} catch (Exception e) {
				System.out.println("Exception:" + e);
			}
		}

		EduMessage msg = new EduMessage("exit");
		try {
			blockingQueue.put(msg);
			System.out.printf("EduBlockingProducer#%d : Exit Message - %s \n", sequence, msg.getMsg());
		} catch (Exception e) {
			System.out.println("Exception:" + e);
		}
	}
}

class EduBlockingConsumer implements Runnable {

	private BlockingQueue<EduMessage> queue;
	private int sequence;

	public EduBlockingConsumer(BlockingQueue<EduMessage> queue, int sequence) {
		this.queue = queue;
		this.sequence = sequence;
	}

	@Override
	public void run() {
		try {
			EduMessage msg;

			while ((msg = queue.take()).getMsg() != "exit") {
				Thread.sleep(10);
				System.out.printf("EduBlockingConsumer#%d : Message - %s consumed.\n", sequence, msg.getMsg());
			}
			System.out.printf("EduBlockingConsumer#%s: exit \n", sequence);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
