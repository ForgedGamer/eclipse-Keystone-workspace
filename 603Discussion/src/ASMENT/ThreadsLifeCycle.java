package ASMENT;
/**********************************************************
 * 
 * Filename:  ThreadsLifeCycle.java
 * Author: Evan Darnell
 * Class:  Programming:  Visual Basic.NET and Java
 * Semester:  2
 * Assignment Number:  6.03 Threads Life Cycle
 * Description:  
 * Share a sample program that uses the thread life cycle (i.e. uses code to initiate, suspend, and resume threads).
 *
 */
import java.lang.Runnable;
public class ThreadsLifeCycle implements Runnable
{
	public Thread uni;
	boolean suspended = false;
	private String threadname;
	ThreadsLifeCycle (String name)
	{
		threadname = name;
		System.out.println("We have created a thread named:" + threadname) ;
	}
	
	public void run()
	{
		try
		{
			System.out.println("hi");
			for(int i = 0; i<3; i+=1) 
			{
				System.out.println("Thread looped " + (i+1) + " times");
				Thread.sleep(30);
				synchronized(this) 
				{
					while(suspended)
					{
						wait();
					}
				}
			}
		}
		catch(InterruptedException ex)
		{
			System.out.println("The thread was interupted...");
		}
		System.out.println("Exiting the thread now!!!");
	}
	
	public void suspend()
	{
		suspended = true;
	}
	
	public void start()	
	{
		if (uni == null)
		{
			uni = new Thread(this, threadname);
			uni.start();
		}
	}

	synchronized void resume()
	{
		
		suspended = false;
		notify();
	}

}
