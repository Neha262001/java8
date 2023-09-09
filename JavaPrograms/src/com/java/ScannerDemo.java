package com.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter ur name : ");
		String name=scanner.nextLine();
		System.out.println("name: "+name);
		System.out.println("Enter ur rollno : ");
		int rollno=scanner.nextInt();
		System.out.println("ROLLNO: "+rollno);
		System.out.println("Enter ur Percentange : ");
		float percentage =scanner.nextFloat();
		System.out.println("Percentage: "+percentage);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter ur name: ");
		String fname;
		try {
			fname = br.readLine();
			System.out.println();
			
		}
		
		
	
		

	}

}
