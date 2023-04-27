package practice.April26;

public class ImplementingRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());

	}

	public static void main(String[] args)
	{
		//I have two runnable interface reference variables, then two different thread groups should be created. then two thread-0 should have been created
		ImplementingRunnable r = new ImplementingRunnable();
		ImplementingRunnable r1 = new ImplementingRunnable();
		Thread t= new Thread(r);
		Thread t1 = new Thread(r1);
		t1.start();
		t.start();
		System.out.println(t1.getThreadGroup());
		System.out.println(t.getThreadGroup());
	}

}
