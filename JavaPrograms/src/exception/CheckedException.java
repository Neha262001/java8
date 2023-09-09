package exception;

public class CheckedException {

	public static void main(String[] args) {
		try {
			Class.forName("patterns.Pattern11");
			System.out.println("Class  found  ");
			
		}catch(Exception e) {
			System.out.println("Class not found : " +e);
			//e.printStackTrace();
		}
        finally {
        	System.out.println("Finally block");
        }
	}

}
