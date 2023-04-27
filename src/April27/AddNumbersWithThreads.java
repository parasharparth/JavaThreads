package April27;

public class AddNumbersWithThreads {

	//There is a big problem in this implementation??? What is that and how will you know about it??
	private static int sum = 0;

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		Runnable adder1 = () -> sum += num1;
		Runnable adder2 = () -> sum += num2;
		Thread thread1 = new Thread(adder1);
		Thread thread2 = new Thread(adder2);
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("The sum is " + sum);
	}
}
