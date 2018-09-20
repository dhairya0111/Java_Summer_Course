package assignment_14;

public class Count_Print implements Runnable{

	int i=1;
	public synchronized void run()
	{
		while(i<1000)
		{
			try {
				Thread.sleep(50);
			}
			catch(InterruptedException e)
			{
				System.out.println("Error");
			}
			System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getState()+" "+i);
			i++;
		}
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getState()+" "+i);
		
	}
}
