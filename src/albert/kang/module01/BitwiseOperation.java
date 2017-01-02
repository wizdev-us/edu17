package albert.kang.module01;

public class BitwiseOperation {

	public int enable(int status, int flag) {
		return status | flag;
	}

	public int disable(int status, int flag) {
		return status & ~flag;
	}

	public boolean isEnabled(int status, int flag) {
		return (status & flag) != 0;
	}

	final int option1 = 0x00000001;
	final int option2 = 0x00000002;
	final int option3 = 0x00000004;
	final int option4 = 0x00000008;
	final int option5 = 0x00000010;

	public static void main(String[] args) {

		BitwiseOperation bitop = new BitwiseOperation();

		System.out.println(Integer.toBinaryString(bitop.option1));
		System.out.println(Integer.toBinaryString(bitop.option2));
		System.out.println(Integer.toBinaryString(bitop.option3));
		System.out.println(Integer.toBinaryString(bitop.option4));
		System.out.println(Integer.toBinaryString(bitop.option5));

		int status = bitop.option1 | bitop.option3;

		System.out.println(bitop.isEnabled(status, bitop.option1));
		System.out.println(bitop.isEnabled(status, bitop.option2));

		status = bitop.enable(status, bitop.option3);
		System.out.println(bitop.isEnabled(status, bitop.option3));

		status = bitop.disable(status, bitop.option1);
		System.out.println(bitop.isEnabled(status, bitop.option1));
	}
}
