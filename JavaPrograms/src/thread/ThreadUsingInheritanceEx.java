package thread;


	class ThreadOnee extends Thread{
		public void run() {
			System.out.println("Thread1");
			for(int i=0;i<5;i++) {
				System.out.println(i);
			}
		}
	}
	class ThreadTwo extends Thread{
		public void run() {
			System.out.println("Thread2");
			for(int i=11;i<=15;i++) {
				System.out.println(i);
			}
		}
	}

	

public class ThreadUsingInheritanceEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	     ThreadOnee t = new ThreadOnee();
	     t.start();
	 	// TODO Auto-generated method stub
	     ThreadTwo t1 = new ThreadTwo();
	     t1.start();
	     

	}

}
