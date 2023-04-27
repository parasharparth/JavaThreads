package April26;

public class ThreadUsingThreadClass extends Thread{
	public static void main(String[] args){
		ThreadUsingThreadClass t = new ThreadUsingThreadClass();
		t.start();
	}

	@Override
	public void run(){
		int a = 10;
		int b=20;
		int c = a + b;
		System.out.println(c);
	}
}
