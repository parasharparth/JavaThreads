package April26;

public class TwoThreads extends Thread{

	public static void main(String[] args){
		TwoThreads t1 = new TwoThreads();
		TwoThreads t2 = new TwoThreads();
		t1.setName("First Thread");
		t2.setName("Second Thread");
		t1.setPriority(6);
		t2.setPriority(9);
		t1.start();
		t2.start();
	}

	@Override
	public void run(){
		System.out.println("Thread run is: "+currentThread().getName());
	}
}
