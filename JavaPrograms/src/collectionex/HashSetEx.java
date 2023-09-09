package collectionex;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashSet<String> hs=new HashSet<> ();
     hs.add("Neha");
     hs.add("lekha");
     hs.add("xy");
     hs.add("Pragathi");
     hs.add("Pragathi");
     System.out.println("Hash set:"+hs);
     
     System.out.println("*****Using Enhanced for loop********");
		for(String i:hs) {
			System.out.println(i);
		}
		System.out.println("*****Using Iterator************");
		Iterator<String> i = hs.iterator();
     while(i.hasNext()) 
         System.out.println(i.next());

	}

     
	}


