package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfArrayEx {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		int ar[]= new int[10];
		int sum=0;
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<ar.length;i++)
		{

			System.out.println("Enter the element at "+ i +" index position");
			ar[i]=Integer.parseInt(bufferedReader.readLine());//runtime error i/o-Exception
			
			if(ar[i]%2!=0) {
				sum=sum+ar[i];
			}
			
			
			
		}
      System.out.println(sum);
	}

}
