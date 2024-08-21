package PracticePrograms;

public class MethodOverloading {

	public int sum(int a, int b) {
		return a + b;
	}

	public int sum(int a, int b, int c) {
		return a + b + c;
	}

	public double sum(int a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		MethodOverloading example = new MethodOverloading();
		System.out.println(example.sum(10, 200));
		System.out.println(example.sum(10, 200, 30));
		System.out.println(example.sum(10, 20.0));
	}

}
