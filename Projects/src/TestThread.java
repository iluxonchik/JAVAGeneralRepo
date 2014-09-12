// Example code from: http://www.tutorialspoint.com/java/java_multithreading.htm

public class TestThread {
	public static void main(String[] args){
		RunnableDemo R1 = new RunnableDemo("Therad-1");
		RunnableDemo R2 = new RunnableDemo("Therad-2");
		
		R1.start();
		R2.start();
		
		ThreadDemo T1 = new ThreadDemo("Thread-1");
		ThreadDemo T2 = new ThreadDemo ("Thread-2");
		
		T1.start();
		T2.start();
	}
}
