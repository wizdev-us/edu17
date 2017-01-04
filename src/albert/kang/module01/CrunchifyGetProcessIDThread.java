package albert.kang.module01;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.lang.management.ThreadMXBean;
 
public class CrunchifyGetProcessIDThread {
	public static void main(String[] args) {
		RuntimeMXBean runtimeBean = ManagementFactory.getRuntimeMXBean();
 
		String jvmName = runtimeBean.getName();
		System.out.println("JVM Name = " + jvmName);
		long pid = Long.valueOf(jvmName.split("@")[0]);
		System.out.println("JVM PID  = " + pid);
 
		ThreadMXBean bean = ManagementFactory.getThreadMXBean();
 
		int peakThreadCount = bean.getPeakThreadCount();
		System.out.println("Peak Thread Count = " + peakThreadCount);
	}
}
