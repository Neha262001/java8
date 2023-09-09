package patterns;

//public class PyramidEx {
//    
//
//	public static void FullPyramid(int n1) {
//		// TODO Auto-generated method stub
//		for(int i=1;i<=n1;i++) {
//			for(int j=1;j<=n1-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println("");
//		}
//	}
//
//
//public static void main(String[] args) {
//
//  FullPyramid(3);
//}
//}
//

public class PyramidEx {
    

	public static void FullPyramid(int n1) {
		// TODO Auto-generated method stub
		for(int i=1;i<=n1;i++) {
			for(int j=1;j<=n1-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				//System.out.print("* ");
				System.out.print( j+" ");
				//System.out.print( i+" ");
				
			}
			System.out.println("");
		}
	}


public static void main(String[] args) {

  FullPyramid(3);
}
}



