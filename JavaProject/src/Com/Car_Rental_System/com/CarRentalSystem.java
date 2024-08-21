package Com.Car_Rental_System.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarRentalSystem {

	private List<Car> cars;
	private List<Customer> customer;
	private List<Rental> rentals;

	public CarRentalSystem() {
		cars = new ArrayList<>();
		customer = new ArrayList<>();
		rentals = new ArrayList<>();

	}

	public void addCar(Car car) {
		cars.add(car);
	}

	public void addCustomer(Customer customers) {
		customer.add(customers);

	}

	public void rentCar(Car car, Customer customer, int days) {
		if (car.isAvailable()) {
			car.rent();
			rentals.add(new Rental(car, customer, days));

		}

	}

	public void returnCar(Car car) {
		car.returnCar();

		Rental rentalToremove = null;

		for (Rental rental : rentals) {
			if (rental.getCar() == car) {
				rentalToremove = rental;
				break;
			}
		}

		if (rentalToremove != null) {
			rentals.remove(rentalToremove);
			// System.out.println("Car returned successfully ");
		} else {
			System.out.println("Car was not rented. ");
		}

	}

	public void menu() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("======= Car Rental System ======");
			System.out.println("1. Rent a Car");
			System.out.println("2. Return a Car");
			System.out.println("3. Exit");
			System.out.println("Enter your choice: ");

			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1) {
				System.out.println("\n== Rent a Car ==\n");
				System.out.println("Enter your name: ");
				String cutomerName = sc.nextLine();

				System.out.println("\nAvailable Cars:");
				for (Car car : cars) {
					if (car.isAvailable()) {
						System.out.println(car.getCardID() + " - " + car.getBrand() + " - " + car.getModel());
					}

				}

				System.out.println("Enter the car ID you want to rent: ");
				String carid = sc.nextLine();

				System.out.println("Enter the number of days for rental: ");
				int rentdays = sc.nextInt();
				sc.nextLine();

				Customer newCustomer = new Customer(carid, cutomerName);
				addCustomer(newCustomer);

				Car selectedCar = null;

				for (Car car : cars) {
					if (car.getCardID().equals(carid) && car.isAvailable()) {
						selectedCar = car;
						break;
					}
				}

				if (selectedCar != null) {

					double totalPrice = selectedCar.calculatePrice(rentdays);
					System.out.println("\n== Rental Information ==\n");
					System.out.println("Customer ID: " + newCustomer.getCustomerID());
					System.out.println("Customer Name: " + newCustomer.getName());
					// System.out.println("Car"+newCustomer);
					System.out.println(" Rental Days " + rentdays);
					System.out.printf("Total Price: $%.2f%n", totalPrice);

					System.out.println("\nConfirm rental (Y/N): ");
					String confirm = sc.nextLine();

					if (confirm.equalsIgnoreCase("Y")) {
						rentCar(selectedCar, newCustomer, rentdays);
						System.out.println("\nCar Rented Successfully");
					} else {
						System.out.println("Rental Canceled.");
					}

				} else {
					System.out.println("\nInvalid car selection or car not available for rent. ");
				}
			} else if (choice == 2) {

				System.out.println("\n== Return a Car ==\n");
				System.out.println("Enter the car ID you want to return:");
				String carID = sc.nextLine();

				Car carToreturn = null;

				for (Car car : cars) {
					if (car.getCardID().equals(carID) && !car.isAvailable()) {
						carToreturn = car;
						break;
					}
				}

				if (carToreturn != null) {
					Customer customer = null;
					for (Rental rental : rentals) {
						if (rental.getCar() == carToreturn) {
							customer = rental.getCustomer();
						}
					}

					if (customer != null) {
						returnCar(carToreturn);
						System.out.println("Car returned successfullt " + customer.getName());
					} else {
						System.out.println("Car was not rented or rental information is missing.");
					}
				} else {
					System.out.println("Invalid car ID or car is not rented ");
				}

			} else if (choice == 3) {
				break;
			} else {
				System.out.println("Invalid choice. Please enter a valid option. ");
			}

		}
		System.out.println("Thank you for using the car rental system! ");
	}

}
