package multithreading_problems;

public class ThreadByExtendingThread extends Thread {
	public void run() {
	System.out.println("Welcome To Extending Thread Class");	
	}
		
	public static void main(String[] args) {
	ThreadByExtendingThread th=new ThreadByExtendingThread();
	th.start();
	}
}
