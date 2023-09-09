package patterns;

public class MiddleNumber {
	

		public static void main(String[] args) {
			int numRows1 = 3;
			int numRows2 = 2;
			int numRows3 = 4;

			
			printMiddleNumberPyramid(numRows1);

		
			printMiddleNumberPyramid(numRows2);

			
			printMiddleNumberPyramid(numRows3);
		}

		public static void printMiddleNumberPyramid(int numRows) {
			for (int i = 1; i <= numRows; i++) {
				for (int j = 1; j <= numRows - i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
		}
	}



