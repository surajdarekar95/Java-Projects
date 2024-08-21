package Com.CarShowroom.Project;

import java.util.Scanner;

public class Showroom implements Utility {

	String showroom_name;
	String showroom_address;
	int total_employees;
	int total_cars_in_stock;
	String manager_name;

	@Override
	public void get_details() {

		System.out.println("Showroom Name: " + showroom_name);
		System.out.println("Showroom Address: " + showroom_address);
		System.out.println("Manager Name: " + manager_name);
		System.out.println("Total Emplyoees: " + total_employees);
		System.out.println("Total cars in stock : " + total_cars_in_stock);

	}

	@Override
	public void set_details() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=========== ENTER SHOWROOM DETAILS ==================");
		System.out.println();
		System.out.println("SHOWROOM NAME");
		showroom_name = sc.nextLine();
		System.out.println("SHOWROOM ADRESS");
		showroom_address = sc.nextLine();
		System.out.println("MANAGER NAME");
		manager_name = sc.nextLine();
		System.out.println("TOTAL NO OF EMPLOYEES");
		total_employees = sc.nextInt();
		System.out.println("TOTAL CARS IN STOCK");
		total_cars_in_stock = sc.nextInt();

	}

}
