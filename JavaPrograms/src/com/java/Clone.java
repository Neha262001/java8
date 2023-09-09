package com.java;

public class Clone {
	public static void main(String[] args) {
		int copyA[]= {0,1,2,3,4};
		
  int cloneA[] = copyA.clone();
  
  System.out.println(copyA == cloneA);
  
  for(int i = 0;i<cloneA.length;i++) {
	  System.out.print(cloneA[i]+" ");
  }
		
	}

}
