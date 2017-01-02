package albert.kang.module01;
public class Array2dEx {
	public static void main(String[] args) throws Exception {

		int[][] number = new int[10][10];

		for (int i = 2; i < number.length; i++) {
			for (int j = 1; j < number[i].length; j++) {
				number[i][j] = i * j;
				System.out.println(i);
			}
		}

		for (int i = 2; i < number.length; i++) {
			System.out.printf("%d 단 : ", i);
			for (int j = 1; j < number[i].length; j++) {
				System.out.printf("%d*%d=%02d ", i, j, number[i][j]);
			}
			System.out.println("");
		}

	}
}
