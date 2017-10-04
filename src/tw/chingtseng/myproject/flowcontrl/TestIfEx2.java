package tw.chingtseng.myproject.flowcontrl;

public class TestIfEx2 {

	public static void main(String[] args) {
		int index = 1;
		int degree = 30;
		if (index == 1) {
			System.out.println("C->F:" + (9 / 5.0) * degree + 32);
		} else {
			System.out.println("F->C:" + (degree - 32) * 5 / 9.0);
		}
	}

}
