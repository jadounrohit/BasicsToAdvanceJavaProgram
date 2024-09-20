package multithreading_problems;

public class ThreadByImpementingRunnable  implements Runnable {
		public void run() {
		System.out.println("Welcome To Implementing Runnable Interface");	
		}
			
		public static void main(String[] args) {
		ThreadByImpementingRunnable th=new ThreadByImpementingRunnable();
		Thread t1 =new Thread(th);   // Using the constructor Thread(Runnable r)
		t1.start();
		}
}
