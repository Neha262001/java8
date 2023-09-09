package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEx {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		int ar[];//array declared without size
		int[] ar1;//array declared without size
		int ar2[]=new int[10];//array declaration with size
		
		// intitialization static,dynamic
		
		int ar3[]= {11,22,33,44,55,66,77,88,99};
		
		//loop through the static array elements
		for(int i=0;i<ar3.length;i++)
		{

			System.out.println( ar3[i]+ " ");
		}
			
			
	
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		//input stream - System.in
		
		//Dynamic initialization of an array
		for(int i=0;i<10;i++)
		{

			System.out.println("Enter a value :");
			ar2[i]=Integer.parseInt(bufferedReader.readLine());
			

		}
		
		//accessing the array elements -- looping through
		for(int i=0;i<10;i++)
		{

			System.out.println( ar2[i]+" ");
		}
			
			
		
	}
}


