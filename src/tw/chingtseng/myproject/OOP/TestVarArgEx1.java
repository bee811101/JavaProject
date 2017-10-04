package tw.chingtseng.myproject.OOP;

public class TestVarArgEx1 {

	// 不知道參數幾個 (int... value)
	public void VarArgSum(int... value) {
		int total = 0;
		// 用enhance for
		for (int num : value) {
			total = total + num;
		}
		System.out.print("total=" + total);
	}

	public static void main(String[] args) {
		TestVarArgEx1 varArgs = new TestVarArgEx1();
		varArgs.VarArgSum(1, 2, 3, 4, 5);

	}

}
