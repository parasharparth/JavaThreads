package April27;

import java.util.Scanner;

public class MultiplicationUsingThreads{

	public static int multiplication = 1;
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int first = sc.nextInt();
		System.out.println("Enter the second number");
		int second = sc.nextInt();
		sc.close();
		Runnable r1 = ()-> {
			synchronized (MultiplicationUsingThreads.class){
			multiplication *= first;
			}
		};
		Runnable r2 = ()-> {
			synchronized (MultiplicationUsingThreads.class){
				multiplication *= second;
			}
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Result "+multiplication);
	}
}
