package albert.module13;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
 
public class NIOClient {
 
	public static void main(String[] args) throws IOException, InterruptedException {
 
		InetSocketAddress bwgAddr = new InetSocketAddress("localhost", 1111);
		SocketChannel bwgClient = SocketChannel.open(bwgAddr);
 
		log("Connecting to Server on port 1111...");
 
		ArrayList<String> companyDetails = new ArrayList<String>();
 
		// create a ArrayList with companyName list
		companyDetails.add("Facebook");
		companyDetails.add("Twitter");
		companyDetails.add("IBM");
		companyDetails.add("Google");
		companyDetails.add("bwg");
 
		for (String companyName : companyDetails) {
 
			byte[] message = new String(companyName).getBytes();
			ByteBuffer buffer = ByteBuffer.wrap(message);
			bwgClient.write(buffer);
 
			log("sending: " + companyName);
			buffer.clear();
 
			// wait for 2 seconds before sending next message
			Thread.sleep(2000);
		}
		bwgClient.close();
	}
 
	private static void log(String str) {
		System.out.println(str);
	}
}
