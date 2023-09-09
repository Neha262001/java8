package patterns;

public class PatternFn {


//	public static void pattern(int n)
//	{
//		int i,j;
//		for(i=n;i>=1;i--) {
//			for(j=1;j<=i;j++) {
//				System.out.print(  " * ");
//			}
//			System.out.println();
//		}
//	}
//	public static void main(String args[]) {
//		int n=7;
//		pattern(n);
//	}
	
	public static void pattern(int n)
{
		int i,j;
		for(i=n;i>=1;i--) {
		for(j=1;j<=i;j++) {
				System.out.print(  " * ");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		int n=4 ; int m=4;int o = 6;
	pattern(n);
	pattern(m);
	pattern(o);
	}
	
}

	


