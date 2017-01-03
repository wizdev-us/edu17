package albert.kang.module04;

import java.util.Vector;
import java.util.Iterator;
 
/**
 * @author Crunchify
 */
 
public class CrunchifyProducerConsumer {
    private static Vector<Object> data = new Vector<Object>();
 
    public static void main(String[] args) {
        new Producer().start();
        new Consumer().start();
    }
 
    public static class Consumer extends Thread {
        Consumer() {
            super("Consumer");
        }
 
        @Override
        public void run() {
            for (;;) {
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                @SuppressWarnings("rawtypes")
                Iterator it = data.iterator();
                while (it.hasNext())
                    it.next();
                
            }
        }
    }
 
    public static class Producer extends Thread {
        Producer() {
            super("Producer");
        }
 
        @Override
        public void run() {
            for (;;) {
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                data.add(new Object());
                if (data.size() > 1000)
                    data.remove(data.size() - 1);
            }
        }
    }
}
