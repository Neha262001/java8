package controlstatements;


//	public class Factorial {

//	static int factorial(int n) {
//		if(n==0)
//			return 1;
//		else
//		return(n*factorial(n-1));
//	}
//	
//	
//        public static void main(String[] args) {
//    
//		int i,fact=1;
//		int number=4;
//		fact=factorial(number);
//		System.out.println("Factorial of "+ number+ " is" + fact );
//  }    
//	public class Factorial {
//
//		public static void main(String[] args) {
//	
//	int fact = 1;
//	int no = 5;
//	for(int i=1;i<=no;i++) {
//		fact = fact*i;
//		
//	}
//	System.out.println("Factorial: "+fact);
//	}
//
public class Factorial {

	public static void main(String[] args) {
		int i=1;
		int fact=1;
		int no=5;
		while(i<=no) {
			fact=fact*i;
			i++;
		}

		System.out.println("Factorial: "+fact);
	}

}
