package albert.kang.module00;

public class GenericMethods {

	public <T1, T2> void f(T1 x, T2 y) {
		System.out.println(x.getClass().getName());
		System.out.println(y.getClass().getName());

		System.out.println(x.toString() + y.toString());
	}
	
	
	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();
		
		gm.f("messag1", "message2");
		gm.f(1, 2);
		gm.f(0.1, 0.2);
	}

}
