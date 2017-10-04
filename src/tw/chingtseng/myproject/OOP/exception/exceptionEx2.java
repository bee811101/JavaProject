package tw.chingtseng.myproject.OOP.exception;

public class exceptionEx2 {

	public void divide(int x, int y) {

		try {
			System.out.println("x/y=" + (x / y));

		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (ClassCastException e) {
			System.out.println("e:" + e);
		} finally {
			// 中斷程式
			// System.exit(-1);
			System.out.println("always run here.");
		}

		System.out.println("always run here2.");
	}

	public static void main(String[] args) {

		exceptionEx2 except2 = new exceptionEx2();
		except2.divide(6, 0);

	}

}
