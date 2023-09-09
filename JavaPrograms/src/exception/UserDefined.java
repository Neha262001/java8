package exception;

public class UserDefined {
	static void validAge(int age) {
	 //void validAge(int age) {
		if(age<18) {
			throw new ArithmeticException("Invalid age");
		}
		else {
			System.out.println("Valid age");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //validAge(12);
		validAge(22);
		//UserDefined u = new UserDefined();
		//u.validAge(12);
	}

}
