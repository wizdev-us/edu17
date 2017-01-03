package albert.kang.module01;

public class FinalizeEx {
	
	String objName;
	public FinalizeEx(String name) {
		objName = name;
	}
	
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println(objName + "이 소멸되었습니다.");
	}
	
	
	public static void main(String[] args) {
		FinalizeEx obj1 = new FinalizeEx("inst01");
		FinalizeEx obj2 = new FinalizeEx("inst02");
		
		obj1 = null;
		obj2 = null;
		
		System.out.println("프로그램을 종료합니다.");
		
		System.gc();
		//System.runFinalization();
	}
}
