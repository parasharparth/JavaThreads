package April27;

public class ImplementingRunnableInterface {

	public static void main(String[] args){
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable implemented");
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
	}
}
