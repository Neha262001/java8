package oopsconcepts;
class Firsti{
	String ap;
	String all = "nnnn";
	Firsti(String ap){
		this.ap=ap;
	}
	void display() {
		System.out.println("parent class" +ap);
	}
}
class Secondi extends Firsti{
	String ap="inheritance";
	String all = "hhhhh";
	Secondi(String ap){
		super(ap);
	}
	void display() {
		super.display();
		System.out.println("parent class" );
		System.out.println(super.all) ;
		
	}
}



public class SuperKeyword {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Secondi sp=new Secondi("polymorphism");
		sp.display();

	}

}
