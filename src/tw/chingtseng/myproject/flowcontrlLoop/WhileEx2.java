package tw.chingtseng.myproject.flowcontrlLoop;

public class WhileEx2 {

	public static void main(String[] args) {
		int i = 1;
		long sum = 0;
		while (i <= 9) {
			sum = sum + i;
			i++;
		}
		System.out.println("SUM is " + sum);
		
		//印出1/7~6/7
		double a=1;
		while(a<=6){
			System.out.println((int)a+"/7="+a/7);
			a++;		
		}
	}

}
