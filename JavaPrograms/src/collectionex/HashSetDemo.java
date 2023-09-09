package collectionex;

import java.util.HashSet;
//USING CONSTRUCTOR
//class Department{
//	int did;
//	String dname;
//	public Department(int did,String dname) {
//		this.did=did;
//		this.dname=dname;
//	}
//}
//
//public class HashSetDemo {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		HashSet<Department> hs=new HashSet<>();
//		hs.add(new Department(1,"Sales"));
//		hs.add(new Department(2,"IT"));
//       for(Department d:hs) {
//    	   System.out.println(d.did);
//    	   System.out.println(d.dname);
//       }
//
//	}
//
//}


class Department{
	int did;
	String dname;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
}

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Department> hs=new HashSet<>();
		Department d1=new Department();
		d1.setDid(10);
		d1.setDname("HR");
		hs.add(d1);
       for(Department d:hs) {
    	   System.out.println("ID :"+d.did);
    	   System.out.println("name :"+d.dname);
       }

	}

}
