package assignment_14;

public class Thread_Implement {

	public static void main(String[] args)
	{
		Count_Print obj=new Count_Print();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		t1.start();
		t2.start();
		//System.out.println("Yo");
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getState());
	}
}
