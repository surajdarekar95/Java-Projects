package Com.Vehicle_App.Project;

public class Car extends Vehicle {

	private int wheels;
	private String type;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentGear;

	public Car(String name, int wheels, String type, int doors, int gears, boolean isManual) {
		super(name);
		this.wheels = wheels;
		this.type = type;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;

		currentGear = 1;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public boolean isManual() {
		return isManual;
	}

	public void setManual(boolean isManual) {
		this.isManual = isManual;
	}

	public int getCurrentGear() {
		return currentGear;
	}

	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}

	public void changeGear(int newGear) {
		this.currentGear = newGear;
		System.out.println("change gear method called : changed to " + this.currentGear + "gear");
	}
	
	public void changeSpeed(int newSpeed,int newDirection) {
		move(newSpeed,newDirection);
		System.out.println("change speed method called: Speed->"+newSpeed+"direction->"+newDirection+"");
	}

}
