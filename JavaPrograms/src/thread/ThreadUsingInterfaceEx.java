package thread;

class Thread11 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread1");
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
	
}
class Thread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread2");
		for(int i=10;i<=15;i++) {
			System.out.println(i);
		}
	
	
	
}

public class ThreadUsingInterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread11 t11=new Thread11();
	    Thread t = new Thread(t11);
	    t.start();
	    Thread2 t2=new Thread2();
	    Thread t3 = new Thread(t2);
	    t3.start();
		}
		}
		
	}

