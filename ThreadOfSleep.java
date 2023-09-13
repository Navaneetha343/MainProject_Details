package Threads;

public class ThreadOfSleep implements Runnable {
     public void run() {
    	 System.out.println("run method started");
    	 try { Thread.sleep(3000);
     } catch(InterruptedException e) {
    	 e.printStackTrace();
     }System.out.println("run method ended");
     
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadOfSleep s1= new ThreadOfSleep();
		        Thread t1= new Thread(s1);
		        t1.start();
	
	}

}
