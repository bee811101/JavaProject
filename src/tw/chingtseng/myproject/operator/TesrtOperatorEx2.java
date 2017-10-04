package tw.chingtseng.myproject.operator;

public class TesrtOperatorEx2 {

	public static void main(String[] args) {
		// 先取值再++
		int i = 1, j;
		j = i++;
		System.out.println("i=" + i);
		System.out.println("j=" + j);

		// 先++再取值
		int a = 1, b;
		b = ++a;
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		int c = 1, d;
		c = c + 1;
		d = ++c;
		System.out.println("c=" + c);
		System.out.println("d=" + d);

	}

}
