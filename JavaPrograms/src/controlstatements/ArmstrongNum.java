package controlstatements;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		int n,r,sum=0,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n/=10;
		}
         if(temp==sum) { 
        	 
     		System.out.println("Armstrong number");
 
         }
         else
         {
     		System.out.println("Not Armstrong number");

         }
	}

}
