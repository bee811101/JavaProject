package tw.chingtseng.myproject.OOP;

public class VariableScopeEx1 {

	int a = 1; // instance variable
	static int b = 2; // static variable

	public void f1(int c) { // local variable
		int d = 4; // local variable

		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		System.out.println("d=" + d);
	}

	public static void f2(int e) {
		// System.out.println("a=" + a); //static先建立起來，讀不到a
		System.out.println("b=" + b);
		// System.out.println("c=" + c); //別人家的local variable
		// System.out.println("d=" + d); //別人家的local variable
		System.out.println("e=" + e); // 自己的local variable
	}

	public static void main(String[] args) {

		VariableScopeEx1 scope = new VariableScopeEx1();
		scope.f1(3);

		VariableScopeEx1.f2(8); //直接呼叫static
		f2(9); 					//因為是static，也可直接用
		VariableScopeEx1 test2 = new VariableScopeEx1(); //也可以直接NEW 但是會有警告不建議
		test2.f2(10);
	}

}
