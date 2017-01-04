package albert.kang.module01.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
 
/**
 * @author Crunchify.com
 * 
 */
 
public class CrunchifyThreadDeadLock {
 
    public static void main(String[] args) throws InterruptedException {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
 
        Thread crunchifyThread1 = new Thread(new CrunchifySynchronizeThread(obj1, obj2), "crunchifyThread1");
        Thread crunchifyThread2 = new Thread(new CrunchifySynchronizeThread(obj2, obj3), "crunchifyThread2");
        Thread crunchifyThread3 = new Thread(new CrunchifySynchronizeThread(obj3, obj1), "crunchifyThread3");
 
        crunchifyThread1.start();
        Thread.sleep(3000);
        crunchifyThread2.start();
        Thread.sleep(3000);
        crunchifyThread3.start();
        
        Thread.sleep(1000);
        crunchifyGenerateThreadDump();
    }
    
    public static String crunchifyGenerateThreadDump() {
        final StringBuilder dump = new StringBuilder();
        final ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        final ThreadInfo[] threadInfos = threadMXBean.getThreadInfo(threadMXBean.getAllThreadIds(), 100);
        for (ThreadInfo threadInfo : threadInfos) {
            dump.append('"');
            dump.append(threadInfo.getThreadName());
            dump.append("\" ");
            final Thread.State state = threadInfo.getThreadState();
            dump.append("\n   java.lang.Thread.State: ");
            dump.append(state);
            final StackTraceElement[] stackTraceElements = threadInfo.getStackTrace();
            for (final StackTraceElement stackTraceElement : stackTraceElements) {
                dump.append("\n        at ");
                dump.append(stackTraceElement);
            }
            dump.append("\n\n");
        }
        return dump.toString();
    }

}
 
class CrunchifySynchronizeThread implements Runnable {
    private Object obj1;
    private Object obj2;
 
    public CrunchifySynchronizeThread(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
 
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (obj1) {
            System.out.println(name + " acquired lock on Object1: " + obj1);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
 
            synchronized (obj2) {
                System.out.println(name + " acquired lock on Object2: " + obj2);
            }
            System.out.println(name + " released lock on Object2: " + obj2);
        }
        System.out.println(name + " released lock on Object1: " + obj1);
        System.out.println(name + " Finished Crunchify Deadlock Test.");
    }
}
