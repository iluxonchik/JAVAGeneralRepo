
public class ThreadClassDemo {
	public static void main(String[] args){
		Runnable hello = new DisplayMessage("Hello");
		Thread thread1 = new Thread(hello);
		thread1.setDaemon(true);
		thread1.setName("hello");
		System.out.println("Starting " + thread1.getName() + "thread...");
		
		Runnable bye = new DisplayMessage("Goodbye");
		Thread thread2 = new Thread(bye);
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread2.setDaemon(true);
		thread2.setName("goodbye");
		System.out.println("Starting " + thread2.getName() + "thread...");
		
		System.out.println("Starting thread3...");
		Thread thread3 = new GuessANumber(27);
		thread3.setName("G1");
		thread3.start();
		try{
			thread3.join(); // wait for the thread to die, before starting thread4
			
		} catch (InterruptedException e){
			System.out.println("Thread interrupted.");
		}
		System.out.println("Starting thread4...");
		Thread thread4 = new GuessANumber(75);
		thread4.setName("G2");
		thread4.start();
		System.out.println("main() is ending...");
		
	}
}
