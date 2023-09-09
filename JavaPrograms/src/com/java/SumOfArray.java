package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int ar[]=new int[8];
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<ar.length;i++)
		{

			System.out.println("Enter the element at "+ i +" index position");
			ar[i]=Integer.parseInt(bufferedReader.readLine());
			
		}
		int sum = 0;
		for(int i=0;i<ar.length;i++)
		{
			sum+=ar[i];
			
		}
		System.out.println("Sum of the elements in Array are: " +sum);
	}
		

}


