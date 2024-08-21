package PracticePrograms;

	class Dog {
		String dog = "Black color dog";
	}
	
	class Cat extends Dog {
		String dog = "White color dog";
	
		public void printcolor() {
			System.out.println(super.dog);
			System.out.println(dog);
		}
	}
	
	public class Super1_Variable {
	
		public static void main(String[] args) {
	
			Cat obj = new Cat();
			obj.printcolor();
	
		}
	
	}
