package tw.chingtseng.myproject.flowcontrl;

public class TestIfElseIfEx1 {

	/**
	 * 月份幾天 及 閏年計算
	 * @param args
	 */
	public static void main(String[] args) {
		int month = 2;
		double year =2016;

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println(month + "有31天");
		}

		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println(month + "有30天");
		}
		
		//2月份 閏年
		else if (month == 2) {

			if (year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0))) {
				System.out.println((int)year + "年，2月是閏年 29天");
			} else {
				System.out.println((int) year + "年，2月不是閏年 28天");
			}

		} else {
			System.out.println(month + " month is not valid");
		}

		System.out.println("finished!");
	}

}
