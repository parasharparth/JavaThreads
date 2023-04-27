package April27;

public class RunnableUsingLambdaExpression {

	public static void main(String[] args){
		//This is the anonymous inner class used to implement the run method of the interface because runnable is a functional Interface.
		Runnable r1 = () -> System.out.println("Runnable Implemented with thread: " + Thread.currentThread().getName());
		Thread t1 = new Thread(r1,"First Thread");
		t1.start();
	}
}
