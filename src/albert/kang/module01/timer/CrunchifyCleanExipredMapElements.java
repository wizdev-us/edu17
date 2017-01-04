package albert.kang.module01.timer;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Timer;
import java.util.TimerTask;
 
/**
 * @author Crunchify.com 
 * 
 * - Keep adding element to Map every second which has expire time set to 5 seconds
 * - Check for expired element every second and delete from map if expired 
 * - After 5 seconds you will get always same size as you are adding and deleting expired elements every second
 * 
 */
 
public class CrunchifyCleanExipredMapElements {
 
	Timer crunchifyTimer;
	private static long EXPIRED_TIME_IN_SEC = 5l;
	private static Map<Double, ArrayList<Date>> crunchifyMap = new HashMap<>();
 
	public static void main(String args[]) {
		new CrunchifyCleanExipredMapElements(1);
		log("Start Adding element every second\n\n");
	}
 
	public CrunchifyCleanExipredMapElements(int seconds) {
		crunchifyTimer = new Timer();
		crunchifyTimer.schedule(new CrunchifyReminder(), 0, seconds * 1000);
	}
 
	class CrunchifyReminder extends TimerTask {
		public void run() {
			
			// We are checking for expired element from map every second
			crunchifyClearExipredElementsFromMap(crunchifyMap);
 
			// We are adding element every second
			addElement();
 
		}
	}
 
	public void addElement() {
		crunchifyAddElementToMap(Math.random(), crunchifyMap);
	}
 
	// Check for element's expired time. If element is > 5 seconds old then remove it
	private static void crunchifyClearExipredElementsFromMap(Map<Double, ArrayList<Date>> map) {
		Date currentTime = new Date();
		Date actualExpiredTime = new Date();
		
		// if element time stamp and current time stamp difference is 5 second then delete element
		actualExpiredTime.setTime(currentTime.getTime() - EXPIRED_TIME_IN_SEC * 1000l);
		System.out.println("crunchifyMap size:" + map.size());
 
		Iterator<Entry<Double, ArrayList<Date>>> crunchifyIterator = map.entrySet().iterator();
		while (crunchifyIterator.hasNext()) {
			Entry<Double, ArrayList<Date>> entry = crunchifyIterator.next();
			ArrayList<Date> crunchifyElement = entry.getValue();
 
			while (crunchifyElement.size() > 0
					&& crunchifyElement.get(0).compareTo(actualExpiredTime) < 0) {
				log("----------- Element Deleted: " + entry.getKey());
				crunchifyElement.remove(0);
			}
 
			if (crunchifyElement.size() == 0) {
				crunchifyIterator.remove();
			}
		}
	}
 
	// Adding new element to map with current timestamp 
	private static void crunchifyAddElementToMap(Double digit, Map<Double, ArrayList<Date>> myMap) {
		ArrayList<Date> crunchifyList = new ArrayList<>();
		myMap.put(digit, crunchifyList);
		crunchifyList.add(new Date());
		log("+++++++++++ Element added:" + digit + "\n");
	}
 
	private static void log(String string) {
		System.out.println(string);
 
	}
}
