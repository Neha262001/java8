package oopsconcepts;

public class RuntimePolymorphism {
	static int multiply(int a,int b) {
		return a*b;
	}
	static double multiply(double a,double b) {
		return a*b;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(RuntimePolymorphism.multiply(2,4));
		System.out.println(RuntimePolymorphism.multiply(2.5,4.3));

	}

}
