package tw.chingtseng.myproject.OOP.exception;

public class exceptionEx1 {

	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 4, 5, 6 };

		try {
			for (int i = 0; i < 7; i++) {
				System.out.printf("data[%d]=%d\n", i, data[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// System.out.print("有錯，但FINISHED");
			// 印出錯誤的STACK
			e.printStackTrace();
		}
		System.out.print("FINFSHED");
	}

}
