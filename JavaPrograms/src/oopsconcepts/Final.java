package oopsconcepts;
class Parent1{
	 final void display() {//
		 
	 }
}
public class Final extends Parent1{//we declare any class as final can not be extend
	final int a = 10;// we can not change value
//	void display() {//we can not override method
//		
//	}

	public static void main(String[] args) {
		Final f new Final();
		//f.a = 15;

	}

}
