package April27;

import java.util.Scanner;

public class SubtractNumbersUsingThreads {

	public static int subtract = 0;
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number");
		int a = sc.nextInt();
		System.out.println("Enter the second Number");
		int b = sc.nextInt();
		Runnable r1 = () -> {
			synchronized (SubtractNumbersUsingThreads.class){
				subtract += a;
			}
		};
		Runnable r2 = () -> {
			synchronized (SubtractNumbersUsingThreads.class){
				subtract -= b;
			}
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Result =" + subtract);
	}
}
