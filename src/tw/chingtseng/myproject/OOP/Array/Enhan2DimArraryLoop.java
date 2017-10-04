package tw.chingtseng.myproject.OOP.Array;

public class Enhan2DimArraryLoop {

	public static void main(String[] args) {
		// 給二維陣列
		int[][] data = { { 1, 2, 3 }, { 4, 5, 6 } };

		// 取維度 兩個一維度
		for (int[] nums : data) {
			// 取維度的值
			for (int value : nums) {
				System.out.println("value=" + value);
			}
		}

		// 給三維陣列
		int[][][] data3 = { { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } } };

		// 取維度 幾個二維
		for (int three[][] : data3) {
			// 取維度 兩個一維度
			for (int[] nums : three) {
				// 取維度的值
				for (int value : nums) {
					System.out.println("value=" + value);
				}
			}
		}
	}
}
