package oopsconcepts;
abstract class AbstractEx1{
	abstract void display();
	void msg() {
		System.out.println("Hello");
	}
	static void msg1() {
		System.out.println("Hello1");
		
		
	}
}
class AbstractChild extends AbstractEx1{

	@Override
	void display() {
		System.out.println("Abstract child");
		
	}
	
}
class AbstractChild1 extends AbstractEx1{

	@Override
	void display() {
		System.out.println("Abstract child1");
		
	}
	
}
public class AbstractClass {

	public static void main(String[] args) {
		AbstractChild1 ac1 = new AbstractChild1();
		ac1.display();
		ac1.msg();
		AbstractEx1 aeref;
		aeref=ac1;
		aeref.display();
		AbstractChild ac = new AbstractChild();
		ac.display();
		ac.msg();
		AbstractEx1.msg1();

	}

}
