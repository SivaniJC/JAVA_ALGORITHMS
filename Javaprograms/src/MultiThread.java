import java.util.*;
class First extends Thread
{
	public void run()
	{
		int num=0;
		Random r=new Random();
		try
		{
			for(int i=0;i<10;i++)
			{
				num=r.nextInt(100);
				System.out.println("First thread generated number is " +num);
				Thread t2=new Thread(new Second(num));
				t2.start();
				Thread t3=new Thread(new Third(num));
				t3.start();
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
class Second implements Runnable
{
	public int x;
	public Second(int a)
	{
		x=a;
	}
	public void run()
	{
		System.out.println("Second thread:Square of the number is"+ x*x);
	}
}
class Third implements Runnable
{
	public int x;
	public Third(int a)
	{
		x=a;
	}
	public void run()
	{
		System.out.println("Third thread:Cube of the number is"+ x*x*x);
	}
}
public class MultiThread {

	public static void main(String[] args) {
		First a=new First();
		a.start();
	}
}
