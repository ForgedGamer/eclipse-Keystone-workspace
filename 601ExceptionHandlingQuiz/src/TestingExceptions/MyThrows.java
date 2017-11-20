package TestingExceptions;
//This is the example given on page 14
public class MyThrows 
{
	static void mythrows() throws IllegalAccessException
	{
		System.out.println("My throws Sample");
		throw new IllegalAccessException("throws Sample");
	}
	
	public static void main(String args[])
	{
		try
		{
			mythrows();
		}
		catch(IllegalAccessException e)
		{
			System.out.println("Catch Exception: " + e);
		}
	}

}
