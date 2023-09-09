package oopsconcepts;
class First{
	int val = 10;
	String ss;
	First(int a, String b){
		val=a; ss=b;
	}
	void display() {
		System.out.println(val+" "+ss);
		
	}
}
class Second extends First{
	Second(int a, String b){
		
	super(a,b);
	
	}
	void display() {
	
		super.display();
		System.out.println("Child class ");
		
	}
	static int var;
	void variable() {
		System.out.println(val+" "+ss+" "+var);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second sc = new Second(22,"using super keyword");
		sc.display();
		Second.var=78;
		sc.variable();
		sc.ss="inheritance";
		Second.var=78;
		sc.variable();
		sc.ss="inheritance2";
		Second.var=80;
		sc.variable();
		

	}

}
