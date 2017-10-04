package tw.chingtseng.myproject.OOP.inheritace;

class Employee {
	String name = "mary";
	String address = "Taiwan";
	String phone = "0987654321";
	int salary = 22000;

	public int getSalary() {
		return salary;
	}

	public void getDetails() {
		System.out.println("name:" + name);
		System.out.println("address:" + address);
		System.out.println("phone:" + phone);
	}
}

// Engineer 繼承 Employee
class Engineer extends Employee {
	String skill = "Java";

	public void program() {
		System.out.println("I can write " + skill + " Program.");
	}

}

// 呼叫Engineer，可使用繼承的
public class CallTestInheritanceEx1 {

	public static void main(String[] args) {
		Engineer softwareEngineer = new Engineer();
		softwareEngineer.name = "Mike";
		softwareEngineer.address = "USA";
		softwareEngineer.phone = "Secret";

		softwareEngineer.program();
		int mySalary = softwareEngineer.salary;

		System.out.println("mySalary is " + mySalary);
		softwareEngineer.getDetails();
	}

}
