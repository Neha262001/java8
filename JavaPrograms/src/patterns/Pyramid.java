package patterns;

public class Pyramid {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			for(int i=1;i<10;i++) {
				for(int k=9;k>i;k--) {
					System.out.print(" ");
				}
				for(int j=1;j<i;j++) {
					System.out.print("* ");
					
				}
				System.out.println("");
			}
		}

	}
	

	


