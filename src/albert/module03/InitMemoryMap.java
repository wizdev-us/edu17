package albert.module03;

class InitValue {
	int instanceValue = 1;
	static int staticValue = 2;

	static { 
		staticValue = 3; 
		System.out.println("in InitValue " + staticValue);
	}
	
	public void showInstanceValue(int x) {
		System.out.println(instanceValue + x);
	}
}

public class InitMemoryMap {
	static int cv = 1;
	int iv = 1;

	static { cv = 2; }

	{ iv = 2; }

	public InitMemoryMap() {
		iv = 3;
	}

	public static void main(String[] args) {
		InitMemoryMap initMap = new InitMemoryMap();
		System.out.println(cv);
		System.out.println(initMap.iv);
		InitMemoryMap initMap2 = new InitMemoryMap();
		System.out.println(cv);
		System.out.println(initMap2.iv);
		
//		System.out.println("in Main " + InitValue.staticValue);
		
		InitValue initValue = new InitValue();
		System.out.println(InitValue.staticValue);
		initValue.showInstanceValue(1);
	}
}
