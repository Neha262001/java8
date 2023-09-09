package controlstatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxFunction {
	static void maxFun(int a,int b,int c){
		if(a>b&&a>b) {
			System.out.println(a+ " is Greater");
		
		}
		else if(b>c&&b>a) {
			System.out.println(b+ "is Greater");

			
		}
		else if(c>a&&c>b) {
			System.out.println(c+ "is Greater");
			
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a:");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter b:");
		int b = Integer.parseInt(br.readLine());
		System.out.println("Enter c:");
		int c = Integer.parseInt(br.readLine());
		maxFun(a,b,c);
		
	}

}
