package PracticePrograms;

	/*Que- How to achieve multiple inheritance in java?
	Ans - we can achieve multiple inheritance in java using interfaces. 
	Interface always contains public and abstract methods, 
	abstract methods means a method have only declaration not implementation,
	we can implements that methods in extended class*/

	interface A{
		public void run();
	}
	
	interface B{
		public void run();
	}
	
	class C implements A,B{
	
		@Override
		public void run() {
	
			System.out.println("Running in C");
		}
		
	}
	
	public class MultipleInheritance {
	
		public static void main(String[] args) {
	
			C obj = new C();
			obj.run();
		}
	
	}
