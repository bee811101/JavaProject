package tw.chingtseng.myproject.flowcontrl;

public class NestedIfEx {

	public static void main(String[] args) {
		int i = -101;
		if (i >= 0) {
			System.out.println(i + "是正數");
			if (i % 2 == 0) {
				System.out.println(i + "是偶數");
			} else {
				System.out.println(i + "是奇數");
			}
		} else {
			System.out.println(i + "是負數");
			if (i % 2 == 0) {
				System.out.println(i + "是偶數");
			} else {
				System.out.println(i + "是奇數");
			}
		}
	}
}
