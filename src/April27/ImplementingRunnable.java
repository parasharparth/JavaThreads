package April27;

public class ImplementingRunnable implements Runnable{
	public static void main(String[] args){
		ImplementingRunnable r1 = new ImplementingRunnable();
		Thread t1 = new Thread(r1);
		t1.start();
	}

	@Override
	public void run()
	{
		System.out.println("Runnable Implemented");
	}
}
