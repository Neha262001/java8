package exception;

import java.security.Timestamp;
import java.time.DateTimeException;

public class ArithematicException {
	

		public static void main(String[] args) {
			try {
			int c=10/4;
			System.out.println("Value of c: "+c);
			//Unchecked /Runtime Exception
	int a[]= {1,2,3,4,5};
			a[2]=45;
			System.out.println(a[2]);
			int a1=Integer.parseInt("123");
			System.out.println(a1);
			String data = null;
			System.out.println( data.length() ); // throws NullPointerException
//			long seconds = System.currentTimeMillis();
//			Timestamp time = new Timestamp(seconds);
//			Date today = (Date)time; // this cast works
//			
			int[] numbers = {1, 2, 3, 4, 5};
			int index = -1;
			try {
			    int x = numbers[index]; 
			    System.out.println(x);
			
			}
			catch(ArithmeticException e){
				System.out.println("number canot divide by zero" +e);
			}
			catch(ArrayIndexOutOfBoundsException e1) {
				System.out.println(e1);
			}
			catch(NumberFormatException e2) {
				System.out.println(e2);
			}
			catch(NullPointerException e3) {
				System.out.println(e3);
			}
			catch(DateTimeException e4) {
				System.out.println(e4);
			}
			finally {
				System.out.println("End of code");
				}
			}

		}
		








