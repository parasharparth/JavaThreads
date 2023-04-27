package April26;

public class ThreadUsingRunnable implements Runnable{

	public static void main(String[] args){
		ThreadUsingRunnable t1 = new ThreadUsingRunnable();
		Thread t = new Thread(t1);
		t.start();
	}


	@Override
	public void run() {
		System.out.println("Runnable run called after overriding it");
	}
}
