package com.java;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10 ;
		int y = 20;
		int sum = x+y;
		int multi = x*y;
		float div = x/y;
		float mod = x%y;
		int a=x++;
		int b=++y;
		int z=1011;
		int z1=~z;
		//int y1 = !z1;
		
		//System.out.println("Y1: "+y1);
		int c=x--;
		int d=--x;
	
		System.out.println("Addition :"+sum);
		System.out.println("Multiplication :"+multi);
		System.out.println("Division :"+div);
		System.out.println("modulous :"+mod);
		System.out.println("Post increment :"+a);
		System.out.println("Pre increment :"+b);
		System.out.println("Invertion :"+z1);
		System.out.println("Post decrement:"+c);
		System.out.println("Pre decrement :"+d);
		System.out.println("--------Shift Operators------");
        int e = 2;
		System.out.println("Right shift "+(e>>2));
		System.out.println("Left shift "+(e<<2));
		System.out.println("--------Relational Boolean------");
		System.out.println("x>y :"+(x>y));
		System.out.println("x<y :"+(x<y));
		System.out.println("x==y:"+(x==y));
		System.out.println("x!=y:"+(x!=y));
		
		int g = 15;
		int h = 30;
		System.out.println("g&h:"+(g&h));
		System.out.println("g|h:"+(g|h));
		System.out.println("g^h:"+(g^h));
		
		int a1 = 4;
		int a2 = 5;
		System.out.println("a1+=a2:"+(a1+=a2));
		System.out.println("a1-=a2:"+(a1-=a2));
		System.out.println("a1*=a2:"+(a1*=a2));
		System.out.println("a1/=a2:"+(a1/=a2));
		System.out.println("a^=b:"+(a^=b));
		System.out.println("a%=b:"+(a%=b));
		System.out.println("----------Terinary operator--------");
        int max=a2>a1?a2:a1;
        System.out.println("MAX:"+max);
        
        





		




		

	}

}
