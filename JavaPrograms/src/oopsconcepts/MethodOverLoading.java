package oopsconcepts;

public class MethodOverLoading {
	static int add(int a,int b) {
		return a+b;
		
	}
	static int add(int a,int b,int c) {
		return a+b+c;
	}
	static float add(float a,int b) {
		return a+b;
	}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MethodOverLoading.add(5.1f,6));
		System.out.println(MethodOverLoading.add(2,4,6));
		System.out.println(MethodOverLoading.add(3,5));

	}

}
