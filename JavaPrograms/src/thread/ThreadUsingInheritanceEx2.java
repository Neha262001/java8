package thread;

class multi extends Thread{
	public void run() {
		System.out.println("Thread1");
	int no=3;
	for(int i=0;i<=10;i++) {
		System.out.println(no + " * " + i + " = " + no*i);
	}
		
	}
}
class Factorial extends Thread{
	
		public void run() {
			System.out.println("Thread2");
		int i,num=8;
		
		int fact=1;
		for( i=1;i<=num;i++) {
			fact=fact*i;
			System.out.println("factorial is:" + fact);
		}
			
		}
	}
class EvenOdd extends Thread{
	
	public void run() {
		System.out.println("Thread3");
		int numb=3;
		if(numb %2==0) {
			System.out.println(numb+ ": is even");
			
		}
		else {
			System.out.println(numb+ ": is odd");
		}
		
	}
}
public class ThreadUsingInheritanceEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multi  t = new multi();
		t.start();
		Factorial t1 = new Factorial();
		t1.start();
		EvenOdd t3 = new EvenOdd();
		t3.start();

	}

}
