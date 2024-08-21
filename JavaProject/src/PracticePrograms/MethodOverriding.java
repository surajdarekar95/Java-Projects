package PracticePrograms;

class Bank {
	public void RateOFintrest() {
		System.out.println("Generally ROI is 7%");
	}
}

class SBI extends Bank {
	@Override
	public void RateOFintrest() {
		System.out.println("SBI ROI is 10%");

	}
}

class HDFC extends Bank {
	@Override
	public void RateOFintrest() {
		System.out.println("HDFD ROI is 8%");
	}

}

public class MethodOverriding {

	public static void main(String[] args) {

		Bank obj = new Bank();
		obj.RateOFintrest();

		SBI obj1 = new SBI();
		obj1.RateOFintrest();

		HDFC obj2 = new HDFC();
		obj2.RateOFintrest();

	}

}
