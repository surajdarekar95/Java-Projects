package PracticePrograms;

class Animal {
	void eat() {
		System.out.println("Barking.....");
	}
}

	class Dog1 extends Animal{
		
		void eat() {
			System.out.println("Eating....");
		
	}
		
		void bark() {
			System.out.println("Barking dog");
		}
		
		void work() {
			super.eat();
			bark();

		}
	
}


public class Super2_Method {

	public static void main(String[] args) {

		Dog1 d =new Dog1();
		d.work();
	}

}
