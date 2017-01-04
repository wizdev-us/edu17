package albert.kang.module01.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class BwgCollectionsSynchronizedList {
 
    public static void main(String[] args) {
 
        ArrayList<String> crunchifyArrayList = new ArrayList<String>();

        crunchifyArrayList.add("Naver");
        crunchifyArrayList.add("Daum");
        crunchifyArrayList.add("Google");
        crunchifyArrayList.add("Facebook");

        List<String> synchronizedList = Collections.synchronizedList(crunchifyArrayList);
        System.out.println("synchronizedList conatins : " + synchronizedList);
 
        Map<String, String> crunchifyMap = new HashMap<String, String>();

        crunchifyMap.put("1", "Naver");
        crunchifyMap.put("2", "Daum");
        crunchifyMap.put("3", "Google");
        crunchifyMap.put("4", "Facebook");

        Map<String, String> synchronizedMap = Collections.synchronizedMap(crunchifyMap);
        System.out.println("synchronizedMap contains : " + synchronizedMap);
    }
}
