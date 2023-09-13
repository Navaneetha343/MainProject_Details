package Threads;

public class RunnableDemo implements Runnable {

	public void run() {
		System.out.println("run method started");
		Thread current= Thread.currentThread();
		System.out.println(current.getName());
		System.out.println("run method ended");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableDemo d = new RunnableDemo();
		Thread t1 = new Thread(d);
		t1.start();
		t1.run();
	}

}
