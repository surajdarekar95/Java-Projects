package InterfaceDemo1;

public class DeskPhone implements Telephone {

	private String myNumber;
	private boolean isRinging;

	public DeskPhone(String myNumber) {
		this.myNumber = myNumber;
	}

	@Override
	public void powerOn() {
		System.out.println("Desk phone is always powered");

	}

	@Override
	public void dial(String phoneNumber) {
		System.out.println("Now Ringing " + phoneNumber + " on deskphone");
	}

	@Override
	public void answer() {
		if (isRinging) {
			System.out.println("Answering the desk phone");
			isRinging = false;
		} else {
			System.out.println("Phone is not ringing");
		}
	}

	@Override
	public boolean callPhone(String phoneNumber) {
		if (phoneNumber == myNumber) {
			isRinging = true;
			System.out.println("phone ringing");
		} else {
			isRinging = false;
		}
		return isRinging;
	}

	@Override
	public boolean isRiniging() {
		return isRinging;
	}

}
