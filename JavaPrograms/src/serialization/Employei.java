package serialization;

import java.io.Serializable;

public class Employei implements Serializable{
	public int id;
	public String name;
	public void Employei() {
		System.out.println("Name: "+name+ "Address: "+id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
