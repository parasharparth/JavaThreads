package April27;

public class ExtendingThreadClass extends Thread{
	public static void main(String[] args){
		ExtendingThreadClass t1 = new ExtendingThreadClass();
		ExtendingThreadClass t2 = new ExtendingThreadClass();
		t1.start();
		t2.start();
		t1.setName("First Thread");
		t2.setName("Second Thread");
		t1.run();
		t2.run();
	}

	@Override
	public void run(){
		System.out.println(currentThread().getName());
	}
}
