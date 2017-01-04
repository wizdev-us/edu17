package albert.kang.module01;


import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.Date;
 
public class CrunchifyGetJVMTime {
    public static void main(String[] args) {
        RuntimeMXBean runtimeBean = ManagementFactory.getRuntimeMXBean();
        long startTime = runtimeBean.getStartTime();
        Date startDate = new Date(startTime);
 
        System.out.println("\nStart Time in millisecond = " + startTime);
        System.out.println("Start Date = " + startDate);
    }
}
