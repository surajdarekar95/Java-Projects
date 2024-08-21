package JavaPrograms;

public class ConstructorInitialization {

	String Animal;
	int Animalcount;
	String name;
	
	
	ConstructorInitialization(String ani,int count,String Name){
		Animal=ani;
		Animalcount=count;
		name=Name;
	}
	
	void display() {
		System.out.println(Animal+" "+Animalcount+" "+name);
	}
}

