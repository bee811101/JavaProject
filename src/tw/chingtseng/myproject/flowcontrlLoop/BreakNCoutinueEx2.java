package tw.chingtseng.myproject.flowcontrlLoop;

public class BreakNCoutinueEx2 {

	public static void main(String[] args) {
		int luckyNum = 5;
		int count = 0;
		while (true) {
			int dice = (int) (Math.random() * 6) + 1;
			System.out.println("Number is=" + dice);

			if (luckyNum == dice) {
				count++;
				if (count == 2) {
					System.out.println("You Win!");
					break;
				}
			} else {
				System.out.println("Try Again!");
			}
		}
	}
}
