package tw.chingtseng.myproject.flowcontrlLoop;

public class NestedWhileLoop {

	public static void main(String[] args) {

		int k=1;
		while(k<=5){
		
		// 正三角
		int a = 1;
		while (a <= 10) {
			int b = 1;
			while (b <= a) {
				System.out.print("*");
				b++;
			}
			System.out.println();
			a++;
		}

		// 倒三角*
		int j = 1;
		while (j <= 10) {
			int i = 10;
			while (i >= j) {
				System.out.print("*");
				i--;
			}
			System.out.println();
			j++;
		}
	
	k++;
		}
	
	}
}
