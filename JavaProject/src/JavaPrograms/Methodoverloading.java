package JavaPrograms;

public class Methodoverloading {

	
	static int sum(int x,int y) {
		return x+y;
	}
	
	static int sum(int x,int y,int z) {
		
		return x+y+z;
			}
	
	static double sum(double x,double y) {
		return x+y;
	}
	
	static double sum(double x,double y,double z) {
		return x+y+z;
	}
	

	
	public static void main(String[] args) {

		
		System.out.println(sum(20, 20, 20));
		System.out.println(sum(10, 20));
		System.out.println(sum(10.10, 10.10));
		System.out.println(sum(12.232324, 34.3450, 12.3460));

	}

}
