package JavaPrograms;

public class MethodTypes {

	int a=10;
	int b=20;
	
	
	void sum() {
		System.out.println(a+b);
	}
	
	int sum1() {
		return a+b;
	}
	
	void sum2(int x,int y) {
		System.out.println(x+y);
	}
	
	int sum3(int y,int z) {
		return(y+z);
	}
	
	
	public static void main(String[] args) {

		MethodTypes Mtypes = new  MethodTypes();
		//Mtypes.sum();
		//int total=Mtypes.sum1();
		//System.out.println(total);
		//Mtypes.sum2(100, 220);
		
		System.out.println(Mtypes.sum3(500,500));
	}

}
