package controlstatements;

public class Palindrome {

	public static void main(String[] args) {


				
				int number=121,
						reverse=0,
						remainder;
				int temp = number;
				while(number!=0) {
					remainder=number%10;
					reverse=reverse*10+remainder;
					number=number/10;
				} 
				if(reverse == temp) {
				System.out.println("Palindrome");
				
				}
				
				else
				{
					System.out.println("Not Palindrome");	
				}
				
				
			}

		

	}


