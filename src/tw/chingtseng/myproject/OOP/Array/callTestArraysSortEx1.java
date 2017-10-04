package tw.chingtseng.myproject.OOP.Array;

public class callTestArraysSortEx1 {

	// 給陣列排序
	int[] data = { 5, 12, 7, 32, 6 };

	public void bubbleSort1() {
		// 一次比一輪
		for (int i = 0; i < data.length - 1; i++) {
			// 前跟後比較 前>後，前放在temp 後往前
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] > data[j]) {
					int temp = 0;
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;

				}
			}
		}

	}

	public void bubbleSort2() {
		
		//無線迴圈，如果Count == 0 沒有做，BREAK
		while (true) {
			int count = 0;
			for (int i = 0; i < data.length - 1; i++) {

				if (data[i] < data[i + 1]) {
					int temp = 0;
					temp = data[i];
					data[i] = data[i + 1];
					data[i + 1] = temp;
					count++;
				}
			}
			if (count == 0) {
				break;
			}
		}
	}

	// 輸出
	public void printSort() {
		for (int k = 0; k < data.length; k++) {
			System.out.println("data[" + k + "]=" + data[k]);
		}
	}

	public static void main(String[] args) {
		callTestArraysSortEx1 sortNum = new callTestArraysSortEx1();
		sortNum.bubbleSort1();
		sortNum.printSort();
	}

}
