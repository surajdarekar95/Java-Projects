package InterfaceDemo1;

public class CellPhone implements Telephone {
	private String phoneNumber;
	private boolean isRinging;
	private boolean isPowerOn;

	public CellPhone(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void powerOn() {

		isPowerOn = true;
		System.out.println("Phone powerd on");
	}

	@Override
	public void dial(String phoneNumber) {
		System.out.println("Now Ringing " + phoneNumber + " on deskphone");
	}

	@Override
	public void answer() {
		if (isRinging && isPowerOn) {
			System.out.println("Answering the phone");
			isRinging = false;
		} else {

		}
	}

	@Override
	public boolean callPhone(String phoneNumber) {
		if (phoneNumber == phoneNumber && isPowerOn) {
			isRinging = true;
			System.out.println("phone ringing");
		} else {
			System.out.println("Wrong Number entered or phone is off");
			isRinging = false;
		}
		return isRinging;
	}

	@Override
	public boolean isRiniging() {
		return isRinging;
	}

}
