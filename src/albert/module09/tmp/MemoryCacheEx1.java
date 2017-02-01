package albert.module09.tmp;

import java.util.ArrayList;

import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.map.LRUMap;
 

public class MemoryCacheEx1 {
	 
    public static void main(String[] args) throws InterruptedException {
 
        MemoryCacheEx1 crunchifyCache = new MemoryCacheEx1();
 
        System.out.println("\n\n==========Test1: crunchifyTestAddRemoveObjects ==========");
        crunchifyCache.crunchifyTestAddRemoveObjects();
        System.out.println("\n\n==========Test2: crunchifyTestExpiredCacheObjects ==========");
        crunchifyCache.crunchifyTestExpiredCacheObjects();
        System.out.println("\n\n==========Test3: crunchifyTestObjectsCleanupTime ==========");
        crunchifyCache.crunchifyTestObjectsCleanupTime();
    }
 
    private void crunchifyTestAddRemoveObjects() {
 
        // Test with crunchifyTimeToLive = 200 seconds
        // crunchifyTimerInterval = 500 seconds
        // maxItems = 6
        CrunchifyInMemoryCache<String, String> cache = new CrunchifyInMemoryCache<String, String>(200, 500, 6);
 
        cache.put("eBay", "eBay");
        cache.put("Paypal", "Paypal");
        cache.put("Google", "Google");
        cache.put("Microsoft", "Microsoft");
        cache.put("IBM", "IBM");
        cache.put("Facebook", "Facebook");
 
        System.out.println("6 Cache Object Added.. cache.size(): " + cache.size());
        cache.remove("IBM");
        System.out.println("One object removed.. cache.size(): " + cache.size());
 
        cache.put("Twitter", "Twitter");
        cache.put("SAP", "SAP");
        System.out.println("Two objects Added but reached maxItems.. cache.size(): " + cache.size());
 
    }
 
    private void crunchifyTestExpiredCacheObjects() throws InterruptedException {
 
        // Test with crunchifyTimeToLive = 1 second
        // crunchifyTimerInterval = 1 second
        // maxItems = 10
        CrunchifyInMemoryCache<String, String> cache = new CrunchifyInMemoryCache<String, String>(1, 1, 10);
 
        cache.put("eBay", "eBay");
        cache.put("Paypal", "Paypal");
        // Adding 3 seconds sleep.. Both above objects will be removed from
        // Cache because of timeToLiveInSeconds value
        Thread.sleep(3000);
 
        System.out.println("Two objects are added but reached timeToLive. cache.size(): " + cache.size());
 
    }
 
    private void crunchifyTestObjectsCleanupTime() throws InterruptedException {
        int size = 500000;
 
        // Test with timeToLiveInSeconds = 100 seconds
        // timerIntervalInSeconds = 100 seconds
        // maxItems = 500000
 
        CrunchifyInMemoryCache<String, String> cache = new CrunchifyInMemoryCache<String, String>(100, 100, 500000);
 
        for (int i = 0; i < size; i++) {
            String value = Integer.toString(i);
            cache.put(value, value);
        }
 
        Thread.sleep(200);
 
        long start = System.currentTimeMillis();
        cache.cleanup();
        double finish = (double) (System.currentTimeMillis() - start) / 1000.0;
 
        System.out.println("Cleanup times for " + size + " objects are " + finish + " s");
 
    }
}


/**
 * @author Crunchify.com
 */
 
class CrunchifyInMemoryCache<K, T> {
 
    private long timeToLive;
    private LRUMap crunchifyCacheMap;
 
    protected class CrunchifyCacheObject {
        public long lastAccessed = System.currentTimeMillis();
        public T value;
 
        protected CrunchifyCacheObject(T value) {
            this.value = value;
        }
    }
 
    public CrunchifyInMemoryCache(long crunchifyTimeToLive, final long crunchifyTimerInterval, int maxItems) {
        this.timeToLive = crunchifyTimeToLive * 1000;
 
        crunchifyCacheMap = new LRUMap(maxItems);
 
        if (timeToLive > 0 && crunchifyTimerInterval > 0) {
 
            Thread t = new Thread(new Runnable() {
                public void run() {
                    while (true) {
                        try {
                            Thread.sleep(crunchifyTimerInterval * 1000);
                        } catch (InterruptedException ex) {
                        }
                        cleanup();
                    }
                }
            });
 
            t.setDaemon(true);
            t.start();
        }
    }
 
    public void put(K key, T value) {
        synchronized (crunchifyCacheMap) {
            crunchifyCacheMap.put(key, new CrunchifyCacheObject(value));
        }
    }
 
    @SuppressWarnings("unchecked")
    public T get(K key) {
        synchronized (crunchifyCacheMap) {
            CrunchifyCacheObject c = (CrunchifyCacheObject) crunchifyCacheMap.get(key);
 
            if (c == null)
                return null;
            else {
                c.lastAccessed = System.currentTimeMillis();
                return c.value;
            }
        }
    }
 
    public void remove(K key) {
        synchronized (crunchifyCacheMap) {
            crunchifyCacheMap.remove(key);
        }
    }
 
    public int size() {
        synchronized (crunchifyCacheMap) {
            return crunchifyCacheMap.size();
        }
    }
 
    @SuppressWarnings("unchecked")
    public void cleanup() {
 
        long now = System.currentTimeMillis();
        ArrayList<K> deleteKey = null;
 
        synchronized (crunchifyCacheMap) {
            MapIterator itr = crunchifyCacheMap.mapIterator();
 
            deleteKey = new ArrayList<K>((crunchifyCacheMap.size() / 2) + 1);
            K key = null;
            CrunchifyCacheObject c = null;
 
            while (itr.hasNext()) {
                key = (K) itr.next();
                c = (CrunchifyCacheObject) itr.getValue();
 
                if (c != null && (now > (timeToLive + c.lastAccessed))) {
                    deleteKey.add(key);
                }
            }
        }
 
        for (K key : deleteKey) {
            synchronized (crunchifyCacheMap) {
                crunchifyCacheMap.remove(key);
            }
 
            Thread.yield();
        }
    }
}
