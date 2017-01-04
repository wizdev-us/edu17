package albert.kang.module01;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
 
public class CrunchifyGetJVMUpTime {
	public static void main(String[] args) {
		RuntimeMXBean runtimeBean = ManagementFactory.getRuntimeMXBean();
 
		long upTime = runtimeBean.getUptime();
		System.out.printf("Up Time = %d (ms)", upTime);
	}
}
