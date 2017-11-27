package ThreadsQ3;
/**********************************************************
 * 
 * Filename:  MultiThread.java
 * Author: Evan Darnell
 * Class:  Programming:  Visual Basic.NET and Java
 * Semester:  2
 * Assignment Number:  6.04 E-Unit Project 
 * Description:  
 * Write a program to start three tasks at a time, given a certain amount of time to make the tasks pause, using multithreading concept.
 *
 */
import java.util.ArrayList;;
public class MultiThread implements Runnable
{
	ArrayList<String> Words= new ArrayList<String>();
	public Thread uni;
	public int Choice;
	boolean suspended = false;
	private String threadname;

	MultiThread (String name)
	{
		threadname = name;
		System.out.println("We have created a thread named:" + threadname) ;
	}
	
	public void run()
	{
		Words.add("Hello");
		Words.add("good bye");
		Words.add("So long");
		Words.add("Still here");
		Words.add("Repeat");
		Words.add("Hello");
		Words.add("good bye");
		Words.add("So long");
		Words.add("Still here");
		Words.add("Repeat");
		Words.add("Hello");
		Words.add("good bye");
		Words.add("So long");
		Words.add("Still here");
		Words.add("Repeat");
		Words.add("Hello");
		Words.add("good bye");
		Words.add("So long");
		Words.add("Still here");
		Words.add("Repeat");
		Words.add("Hello");
		Words.add("good bye");
		Words.add("So long");
		Words.add("Still here");
		Words.add("End");
		try
		{
			
			
			for(int i = 0; i<30; i+=1) 
			{
					switch(Choice)
					{
					case 1:
							if(i%2 == 0 == false)
							{
								System.out.println(i + " is odd.");
							}
							break;
					case 2:
							if(i%2 == 0 == true)
							{
								System.out.println(i + " is even");
							}
							break;
					case 3:
						if( i <24)
						{
							System.out.println(Words.get(i));
						}
					}
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
