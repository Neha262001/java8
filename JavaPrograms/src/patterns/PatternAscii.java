package patterns;

public class PatternAscii {

	public static void main(String[] args) {
		for(int i = 65;i<= 75;i++)//row
		{
			for(int j = 65; j<=i;j++) {//column
				char k = (char)j;
				System.out.print(k+" ");
				
				
			}
			System.out.println();
		}

	}

}
