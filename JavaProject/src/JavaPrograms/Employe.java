package JavaPrograms;

public class Employe {
	
	int id;
	String name;
	String department;
	int salary;
	
	
	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(department);
		System.out.println(salary);

	}
	
	public static void main(String [] args) {
		Employe emp1=new Employe();
		emp1.department="prod";
		emp1.id=1001;
		emp1.name="suraj";
		emp1.salary=100000;
		emp1.display();
		
		Employe emp2=new Employe();
		emp2.department="QA";
		emp2.id=2001;
		emp2.name="Rohan";
		emp2.salary=200000;
		emp2.display();
		
	}

}
