package JavaPrograms;

public class MethodInitialization {

	int id;
	char initail;
	String name;
	String department;
	double sal;
	
	void getValues(int Id,char FirstLetter,String Name,String Dep,Double salary) 
	{
		id=Id;
		initail=FirstLetter;
		name=Name;
		department=Dep;
		sal=salary;
	}
	
	void printvalues() {
		System.out.println(id);
		System.out.println(initail);
		System.out.println(name);
		System.out.println(department);
		System.out.println(sal);

	}
}
