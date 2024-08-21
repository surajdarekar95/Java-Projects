package PracticePrograms;

class encapEX {

	private String name;
	private int rollno;
	private int AGE;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getAGE() {
		return AGE;
	}

	public void setAGE(int aGE) {
		AGE = aGE;
	}

}

public class Encapsulation {

	public static void main(String[] args) {
		encapEX data = new encapEX();
		data.setName("suraj");
		data.setAGE(29);
		data.setRollno(61081090);
		System.out.println(data.getName());
		System.out.println(data.getAGE());
		System.out.println(data.getRollno());
	}

}
