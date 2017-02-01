package albert.module09.tmp;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx1 {

	public static void main(String[] args) {
		Queue<Message> queue = new LinkedList<Message>();

		queue.offer(new Message("sendMail", "Jack"));
		queue.offer(new Message("sendSMS", "Maggie"));
		queue.offer(new Message("sendKakaotalk", "Blue"));
		queue.offer(new Message("sendLine", "Jack"));

		while (!queue.isEmpty()) {
			Message msg = queue.poll();

			switch (msg.command) {
			case "sendMail":
				System.out.println(msg.to + " 님께 메일을 보냅니다");
				break;

			case "sendSMS":
				System.out.println(msg.to + " 님께 문자를 보냅니다");
				break;

			case "sendKakaotalk":
				System.out.println(msg.to + " 님께 카톡을 보냅니다");
				break;

			case "sendLine":
				System.out.println(msg.to + " 님께 라인을 보냅니다");
				break;
			}
		}
	}

}

class Message {
	public String command;
	public String to;

	public Message(String command, String to) {
		super();
		this.command = command;
		this.to = to;
	}

}
