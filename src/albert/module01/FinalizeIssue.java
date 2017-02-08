package albert.module01;

public class FinalizeIssue {

	String objName;

	public FinalizeIssue(String name) {
		objName = name;
	}

	public static void main(String[] args) {
		FinalizeIssue obj1 = new FinalizeIssue("inst01");
		FinalizeIssue obj2 = new FinalizeIssue("inst02");

		obj1 = null;
		obj2 = null;

		System.out.println("프로그램을 종료합니다.");

		System.gc();
		// System.runFinalization();
	}

	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println(objName + "이 소멸되었습니다.");
	}
}
