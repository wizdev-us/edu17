package albert.module13;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;
 
public class NIOServer {
 
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
 
		// Selector: multiplexor of SelectableChannel objects
		Selector selector = Selector.open(); // selector is open here
 
		// ServerSocketChannel: selectable channel for stream-oriented listening sockets
		ServerSocketChannel bwgSocket = ServerSocketChannel.open();
		InetSocketAddress bwgAddr = new InetSocketAddress("localhost", 1111);
 
		// Binds the channel's socket to a local address and configures the socket to listen for connections
		bwgSocket.bind(bwgAddr);
 
		// Adjusts this channel's blocking mode.
		bwgSocket.configureBlocking(false);
 
		int ops = bwgSocket.validOps();
		SelectionKey selectKy = bwgSocket.register(selector, ops, null);
 
		// Infinite loop..
		// Keep server running
		while (true) {
 
			log("i'm a server and i'm waiting for new connection and buffer select...");
			// Selects a set of keys whose corresponding channels are ready for I/O operations
			selector.select();
 
			// token representing the registration of a SelectableChannel with a Selector
			Set<SelectionKey> bwgKeys = selector.selectedKeys();
			Iterator<SelectionKey> bwgIterator = bwgKeys.iterator();
 
			while (bwgIterator.hasNext()) {
				SelectionKey myKey = bwgIterator.next();
 
				// Tests whether this key's channel is ready to accept a new socket connection
				if (myKey.isAcceptable()) {
					SocketChannel bwgClient = bwgSocket.accept();
 
					// Adjusts this channel's blocking mode to false
					bwgClient.configureBlocking(false);
 
					// Operation-set bit for read operations
					bwgClient.register(selector, SelectionKey.OP_READ);
					log("Connection Accepted: " + bwgClient.getLocalAddress() + "\n");
 
					// Tests whether this key's channel is ready for reading
				} else if (myKey.isReadable()) {
					
					SocketChannel bwgClient = (SocketChannel) myKey.channel();
					ByteBuffer bwgBuffer = ByteBuffer.allocate(256);
					bwgClient.read(bwgBuffer);
					String result = new String(bwgBuffer.array()).trim();
 
					log("Message received: " + result);
 
					if (result.equals("bwg")) {
						bwgClient.close();
						log("\nIt's time to close connection as we got last company name 'bwg'");
						log("\nServer will keep running. Try running client again to establish new connection");
					}
				}
				bwgIterator.remove();
			}
		}
	}
 
	private static void log(String str) {
		System.out.println(str);
	}
}