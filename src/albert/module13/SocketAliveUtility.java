package albert.module13;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
 
public class SocketAliveUtility {
 
	public static void main(String[] args) {
 
		log(isSocketAliveUitlitybyBwg("localhost", 8080));
 
		log(isSocketAliveUitlitybyBwg("naver.com", 80));
	}
 
	public static boolean isSocketAliveUitlitybyBwg(String hostName, int port) {
		boolean isAlive = false;
 
		SocketAddress socketAddress = new InetSocketAddress(hostName, port);
		Socket socket = new Socket();
 
		int timeout = 2000;
 
		log("hostName: " + hostName + ", port: " + port);
		try {
			socket.connect(socketAddress, timeout);
			socket.close();
			isAlive = true;
 
		} catch (SocketTimeoutException exception) {
			System.out.println("SocketTimeoutException " + hostName + ":" + port + ". " + exception.getMessage());
		} catch (IOException exception) {
			System.out.println(
					"IOException - Unable to connect to " + hostName + ":" + port + ". " + exception.getMessage());
		}
		return isAlive;
	}
 
	private static void log(String string) {
		System.out.println(string);
	}
 
	private static void log(boolean isAlive) {
		System.out.println("isAlive result: " + isAlive + "\n");
	}
 
}
