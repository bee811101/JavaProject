package tw.chingtseng.myproject.flowcontrlLoop;

public class ForLoop {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("i= " + i);
		}
		System.out.println("finished");

		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
