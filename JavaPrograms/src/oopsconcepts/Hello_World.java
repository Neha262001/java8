package oopsconcepts;
abstract class Bird{
	abstract void makeSound();
}
class Duck extends Bird{
	public void makeSound() {
		System.out.println("The sound that a Duck makes:Quack Quack");
	}
}
class Owl extends Bird{
	public void makeSound() {
		System.out.println("The sound that a Owl makes:Hoot Hoot");
	}
}
public class Hello_World {
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Duck d = new Duck();
		d.makeSound();
		Owl c = new Owl();
		c.makeSound();

	}

}
