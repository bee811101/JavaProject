package tw.chingtseng.myproject.OOP;

class car {
	static int speed = 60;

	public static void speedUp() {

		System.out.println("speed+20 =  " + (speed + 20));
		
	}
}

//static靜態用法
public class StaticEx1 {
	public static void main(String[] args) {

		car.speed = 80;
		car.speedUp();

		car.speed = 20;
		car.speedUp();
	}
}
