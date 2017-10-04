package tw.chingtseng.myproject.OOP;

class weather {
	public double degreeConverter(int degree){
		double degreef=degree*9/5+32;
		return degreef;
		
	}
}

public class methodEx4 {

	public static void main(String[] args) {
		weather change=new weather();
		double f=change.degreeConverter(30);
		System.out.print("華氏="+	f);
	}

}
