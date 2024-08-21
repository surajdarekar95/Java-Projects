package InterfaceDemo1;

public interface Telephone {
	
	
	//1. Power On
	void powerOn();
	
	//2. dial a number
	void dial(String phoneNumber);
	
	//3.answer phonecall
	void answer();
	
	//4.call another phone
	boolean callPhone(String phoneNumber);
	
	//5.isRinging
	boolean isRiniging();

}
