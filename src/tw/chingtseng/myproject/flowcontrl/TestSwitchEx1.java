package tw.chingtseng.myproject.flowcontrl;

public class TestSwitchEx1 {

	public static void main(String[] args) {
		int num=(int) (Math.random()*6+1);
		System.out.println("num is "+num);
		
		switch(num){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6: 
			System.out.println("lucky number is "+num);
			break;
			default:
				System.out.println("impossible ");
		}
		
	}

}
