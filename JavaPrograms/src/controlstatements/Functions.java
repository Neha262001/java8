package controlstatements;

public class Functions { 
	void add(int a,int b) {
		System.out.println("Addition : "+(a+b));
	}
	void sub(int a,int b) {
		System.out.println("Substraction : "+(a-b));
		
	}
	void mult(int a,int b) {
		System.out.println("Multiplication : "+(a*b));
	}
	void div(int a,int b) {
		System.out.println("Addition : "+(a/b));
	}
	public static void main(String[] args) {
		Functions f = new Functions();
		f.add(3, 6);
		f.sub(6, 3);
		f.mult(6, 3);
		f.div(6, 3);

	}

}
