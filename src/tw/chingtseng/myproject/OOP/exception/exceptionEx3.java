package tw.chingtseng.myproject.OOP.exception;

public class exceptionEx3 {

	// 只有checked exception 才能要求使用者寫try catch
	// ArithmeticException屬於 runtimeException
	public void divide(int x, int y) throws ArithmeticException, Exception {
		System.out.println("x/y=" + (x / y));
	}

	public static void main(String[] args) { // throws Exception { 再丟給JVM做

		exceptionEx3 except3 = new exceptionEx3();
		try {
			except3.divide(5, 0);
		} catch (ArithmeticException e) {
			System.out.println("always runrunrunrunrunrun ");
			e.printStackTrace();

		} catch (Exception e) {
			System.out.println("always run here.");
			e.printStackTrace();
		}
	}

}
