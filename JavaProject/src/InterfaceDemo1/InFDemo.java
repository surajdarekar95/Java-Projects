package InterfaceDemo1;

public class InFDemo {

	public static void main(String[] args) {

		/*DeskPhone phone = new DeskPhone("8806651424");
		phone.powerOn();
		phone.callPhone("8806651424");
		phone.answer();*/
		
		CellPhone call = new CellPhone("8806651424");
		call.powerOn();
		call.callPhone("8806651424");
		call.answer();
	}

}
