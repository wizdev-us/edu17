package albert.kang.module01.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
/**
 * @author Crunchify.com
 * 
 */
 
public class CrunchifySynchronizedListFromArrayList {
 
    public static void main(String[] args) {
 
        // ********************** synchronizedList ************************
        ArrayList<String> crunchifyArrayList = new ArrayList<String>();
 
        // populate the crunchifyArrayList
        crunchifyArrayList.add("eBay");
        crunchifyArrayList.add("Paypal");
        crunchifyArrayList.add("Google");
        crunchifyArrayList.add("Yahoo");
 
        // Returns a synchronized (thread-safe) list backed by the specified
        // list. In order to guarantee serial access, it is critical that all
        // access to the backing list is accomplished through the returned list.
        List<String> synchronizedList = Collections.synchronizedList(crunchifyArrayList);
 
        System.out.println("synchronizedList conatins : " + synchronizedList);
 
        // ********************** synchronizedMap ************************
        Map<String, String> crunchifyMap = new HashMap<String, String>();
 
        // populate the crunchifyMap
        crunchifyMap.put("1", "eBay");
        crunchifyMap.put("2", "Paypal");
        crunchifyMap.put("3", "Google");
        crunchifyMap.put("4", "Yahoo");
 
        // create a synchronized map
        Map<String, String> synchronizedMap = Collections.synchronizedMap(crunchifyMap);
 
        System.out.println("synchronizedMap contains : " + synchronizedMap);
    }
}
