package com.java;



public class LocalVariableEx {
	String empLocat;
	static int age;
      public void display() {
    	  int empNo=10;
    	  String empName="Neha";
    	  int empAge=24;
    	  System.out.println("Employee number: "+empNo);
    	  System.out.println("Employee Name: "+empName);
    	  System.out.println("Employee Age: "+empAge);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalVariableEx lv = new LocalVariableEx();
		lv.display();
		lv.empLocat="chennai";
		System.out.println("-------another way of object creation-----");
		
		LocalVariableEx emp = new LocalVariableEx();
		emp.display();
		emp.empLocat="chennai";
		System.out.println("Employee Lcation :" + emp.empLocat);
		age = 30;
       System.out.println("Employee Age Modified :" + LocalVariableEx.age);
		
		
		

	}

}
