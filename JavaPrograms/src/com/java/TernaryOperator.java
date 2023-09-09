package com.java;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------even or odd--------");
		int num=25;
		String result=(num%2==0)? "even": "odd";
		System.out.println(num + " is " + result + ".");
		System.out.println("---max out of 3----");
		int a=12; int b=2;
		int max = (a>b)?a:b;
		System.out.println("max number is : " + max);
		System.out.println("---Grade----");
		int marks = 90;
		char grade =(marks>90)?'A':(marks>80)?'B':(marks>70)?'C':(marks>60)?'D':'F';
		System.out.println(grade);
		
				
				

	}

}
