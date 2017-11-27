package ThreadsQ3;

public class Multithread_2 
{
	public static void main(String args[])
	{
		MultiThread Thread1 = new MultiThread("Thread 1");
		Thread1.start();
		MultiThread Thread2 = new MultiThread("Thread 2");
		Thread2.start();
		MultiThread Thread3 = new MultiThread("Thread 3");
		Thread3.start();
		Thread3.Choice=3;
		Thread2.Choice=2;
		Thread1.Choice=1;
		System.out.println("Thread1 will print even numbers. Thread2 will print odd numbers.");
		
		try 
		{
				
				Thread.sleep(20);
				Thread1.suspend();
				System.out.println("Suspending Thread 1.");
				Thread.sleep(30); 
				System.out.println("Gonna resume thread 1 now!");
				Thread1.resume();
				Thread.sleep(20);
				
				
				Thread2.suspend();
				System.out.println("Suspending Thread 2.");
				Thread.sleep(40); 
				System.out.println("Gonna resume thread 2 now!");
				Thread2.resume();
				
				Thread.sleep(20);
				Thread3.suspend();
				System.out.println("Suspending Thread 3.");
				Thread.sleep(60);
				System.out.println("Gonna resume thread 3 now!");
				Thread3.resume();
				
			
		}
		catch(InterruptedException ex)
		{
			System.out.println("The operations were interrupted.");
		}
		try
		{
			Thread1.uni.join();
			Thread2.uni.join();
		}
		catch(InterruptedException exx)
		{
			System.out.println("The operations were interrupted.");
		}
	}
}
