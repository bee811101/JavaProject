package tw.chingtseng.myproject.OOP.encaosulation;

class Elevator {

	private int level = 1;
	private String status = "open";

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

public class CallTestEncapsulationEx1 {

	public static void main(String[] args) {
		Elevator iii = new Elevator();
		// iii.status = "closed";
		// System.out.println("iii.status=" + iii.status);

		// level為private
		// System.out.println("iii.level="+iii.level);

		iii.setStatus("Closed");
		String myStatus = iii.getStatus();
		System.out.println("myStatus:" + myStatus);

		iii.setLevel(3);
		int myLevel = iii.getLevel();
		System.out.println("myLevel:" + myLevel);

	}

}
