package Com.Vehicle_App.Project;

public class Vehicle_Main {

	public static void main(String[] args) {

		SUV Thar = new SUV("Thar",false);
		Thar.move(40, 0);
		Thar.accelerate(20);
		//Thar.accelerate(-60);
		System.out.println("Current Gear :" +Thar.getCurrentGear());
		System.out.println("Current Speed :" +Thar.getCurrentSpeed());

	}

}
