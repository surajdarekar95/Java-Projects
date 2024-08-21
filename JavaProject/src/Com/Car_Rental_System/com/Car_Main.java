package Com.Car_Rental_System.com;

public class Car_Main {

	public static void main(String[] args) {

		CarRentalSystem rentalSystem = new CarRentalSystem();

		Car car1 = new Car("COO1", "Toyota", "Camry", 60.0);
		Car car2 = new Car("COO2", "TATA", "Nexon", 50.0);
		Car car3 = new Car("COO3", "Mahindra", "Thar", 80.0);
		rentalSystem.addCar(car1);
		rentalSystem.addCar(car2);
		rentalSystem.addCar(car3);

		rentalSystem.menu();
	}

}
