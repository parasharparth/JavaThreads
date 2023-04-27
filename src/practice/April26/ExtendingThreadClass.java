package practice.April26;

public class ExtendingThreadClass extends Thread{
	public void run()
	{
		System.out.println(currentThread().getName());
	}

	public static void main(String[] args){
		ExtendingThreadClass t1= new ExtendingThreadClass();
		ExtendingThreadClass t2 = new ExtendingThreadClass();
		t1.setPriority(1);
		t2.setPriority(10);
		t1.start();
		t2.start();
		t1.setName("First");
		t2.setName("Second");
	}
}
