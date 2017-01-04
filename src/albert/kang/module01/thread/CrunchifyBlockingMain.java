package albert.kang.module01.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author Crunchify.com
 * 
 */

public class CrunchifyBlockingMain {

	public static void main(String[] args) {

		// Creating BlockingQueue of size 10
		// BlockingQueue supports operations that wait for the queue to become
		// non-empty when retrieving an element, and
		// wait for space to become available in the queue when storing an
		// element.
		BlockingQueue<CrunchifyMessage> crunchQueue = new ArrayBlockingQueue<>(10);
		CrunchifyBlockingProducer crunchProducer = new CrunchifyBlockingProducer(crunchQueue);
		CrunchifyBlockingConsumer crunchConsumer = new CrunchifyBlockingConsumer(crunchQueue);

		// starting producer to produce messages in queue
		new Thread(crunchProducer).start();

		// starting consumer to consume messages from queue
		new Thread(crunchConsumer).start();

		System.out.println("Let's get started. Producer / Consumer Test Started.\n");
	}
}


class CrunchifyMessage {
    private String crunchifyMsg;
    
    public CrunchifyMessage(String string) {
        this.crunchifyMsg = string;
    }
    
    public String getMsg() {
        return crunchifyMsg;
    }
}


class CrunchifyBlockingProducer implements Runnable {

	private BlockingQueue<CrunchifyMessage> crunchQueue;

	public CrunchifyBlockingProducer(BlockingQueue<CrunchifyMessage> queue) {
		this.crunchQueue = queue;
	}

	@Override
	public void run() {
		// producing CrunchifyMessage messages
		for (int i = 1; i <= 5; i++) {
			CrunchifyMessage msg = new CrunchifyMessage("i'm msg " + i);
			try {
				Thread.sleep(10);
				crunchQueue.put(msg);
				System.out.println("CrunchifyBlockingProducer: Message - " + msg.getMsg() + " produced.");
			} catch (Exception e) {
				System.out.println("Exception:" + e);
			}
		}

		// adding exit message
		CrunchifyMessage msg = new CrunchifyMessage("All done from Producer side. Produced 50 CrunchifyMessages");
		try {
			crunchQueue.put(msg);
			System.out.println("CrunchifyBlockingProducer: Exit Message - " + msg.getMsg());
		} catch (Exception e) {
			System.out.println("Exception:" + e);
		}
	}
}

class CrunchifyBlockingConsumer implements Runnable {

	private BlockingQueue<CrunchifyMessage> queue;

	public CrunchifyBlockingConsumer(BlockingQueue<CrunchifyMessage> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			CrunchifyMessage msg;

			// consuming messages until exit message is received
			while ((msg = queue.take()).getMsg() != "exit") {
				Thread.sleep(10);
				System.out.println("CrunchifyBlockingConsumer: Message - " + msg.getMsg() + " consumed.");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
