package tw.chingtseng.myproject.flowcontrlLoop;

public class ForLoopEx2 {

	public static void main(String[] args) {
		/*
		 * 九九乘法表，利用%d 帶入值 %2d=>至少帶入兩位 來對齊
		 */

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d*%d=%2d\t", i, j, i * j);
			}
			System.out.println();
		}
		
		System.out.printf("My name is %s,I am %d years old", "Ivy",24);	
	}
}
