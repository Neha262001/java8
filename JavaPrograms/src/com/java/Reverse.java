package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse{

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int ar[]=new int[10];
		
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print("Enter the element at "+ i +" index position");
			ar[i]=Integer.parseInt(bufferedReader.readLine());
			
		}
		
		
		
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]+ " ");
		
		}
	}

}
