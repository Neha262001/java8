package com.java;

public class StringBufferExm {

	public static void main(String[] args) {  
		
			StringBuffer sb = new StringBuffer("Hello");
			
			System.out.println("String Before append :" +sb);
			sb.append("Buddies");
			System.out.println("String after append :" +sb);
			System.out.println(" Reverse String  :" +sb.reverse());
			sb.insert(4, "Study");
			System.out.println("String after insert :" +sb);
			sb.delete(4, 9);
			System.out.println("String after delete :" +sb);



			

		

	

	}

}
