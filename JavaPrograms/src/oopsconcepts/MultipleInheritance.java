package oopsconcepts;
interface Parent11{
	void displayParent11();
	
}
interface Parent2{
	void displayParent2();
	
}
interface Child extends Parent11,Parent2{
	void displayChild();
	
}
class Child1 implements Child{
	
		@Override
		public void displayParent2() {
			// TODO Auto-generated method stub
			System.out.println("Parent2");
			
		}

		@Override
		public void displayChild() {
			// TODO Auto-generated method stub
			System.out.println("child");
			
		}

		
		@Override
		public void displayParent11() {
			// TODO Auto-generated method stub
			System.out.println("paarent11");
			
		}
		
	}

public class MultipleInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Child1 c =  new Child1();
       c.displayParent11();
       c.displayParent2();
       c.displayChild();
	}

}
