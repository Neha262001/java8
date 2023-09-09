package thread;

class ThreadOne extends Thread{
	public void run() {
		System.out.println("Thread1");
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
}

public class ThreadUsingInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ThreadOne t = new ThreadOne();
     t.start();
     
	}

}
