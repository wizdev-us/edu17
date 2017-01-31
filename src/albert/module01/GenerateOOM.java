package albert.module01;

public class GenerateOOM {

	public static void main(String[] args) throws Exception {
		GenerateOOM memoryTest = new GenerateOOM();
		memoryTest.generateOOM();
	}

	public void generateOOM() throws Exception {
		int iteratorValue = 20;
		System.out.println("\n>>> OOM test started.\n");

		for (int i = 1; i < 20; i++) {
			System.out.println("Iteration " + i + " Free Mem: " + Runtime.getRuntime().freeMemory());
			int[] memoryFillIntVar = new int[iteratorValue];

			iteratorValue = iteratorValue * 5;
			System.out.println("\nRequired Memory for next loop: " + iteratorValue);
			Thread.sleep(1000);
		}
	}
}