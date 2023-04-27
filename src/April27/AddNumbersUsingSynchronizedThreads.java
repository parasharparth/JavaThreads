package April27;

import java.util.Scanner;

public class AddNumbersUsingSynchronizedThreads {
	public static int sum = 0;
	public static void main(String[] args){
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first Number");
			int firstNum = sc.nextInt();
			System.out.println("Enter the second number");
			int secondNum = sc.nextInt();
			sc.close();
			Runnable r1 = () -> {
				synchronized (AddNumbersUsingSynchronizedThreads.class) {
					sum += firstNum;
				}
			};
			Runnable r2 = () -> {
				synchronized (AddNumbersUsingSynchronizedThreads.class) {
					sum += secondNum;
				}
			};
			Thread t1 = new Thread(r1, "first Thread");
			Thread t2 = new Thread(r2, "Second Thread");
			t1.start();
			t2.start();
			t1.join();
			t2.join();
			System.out.println(sum);
		}catch(Exception e){
			System.out.println("Exception "+e.getMessage());
		}
	}
}
