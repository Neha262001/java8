package oopsconcepts;
class Rectangle{
	private double len;
	private double wid;
	public Rectangle() {//default constructor
		len = 0;
		wid = 0;
	}
	public Rectangle(double len, double wid) {//parameterised constructor
		this.len = len;
		this.wid = wid;	
	}
	public double getArea() {
		return len*wid;
	}
}

class Box extends Rectangle{
	double height;
	public Box() {//default constructor of parent class
		super();
		height = 0;
	}
	public Box(double len, double wid, double height) {
		super(len,wid);
		this.height = height;
		
	}
	public double getVolume() {
		return getArea() * height;
	}
	
	
}

public class SuperConstructor {

	public static void main(String[] args) {
		Box b = new Box();//default
		System.out.println("Volume: " + b.getVolume());
		
		Box b1 = new Box(15.8, 2.5, 8.3);//parameterised
		System.out.println("Volume: " + b1.getVolume());
		

	}

}
