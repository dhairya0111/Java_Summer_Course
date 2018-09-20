package assignment_11;

public class stack_use {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException
	{
		
	stack obj=new stack();
	obj.pop();
	
	for(int i=0;i<10;i++)
	{
		obj.push(i);
	}
	
	
	System.out.println(obj.isEmpty());
	obj.pop();
	obj.pop();
	for(int i=0;i<obj.counter;i++)
	{
		System.out.print(obj.arr[i]+"");	
	}
	obj.Empty();
	for(int i=0;i<obj.counter;i++)
	{
		System.out.print(obj.arr[i]+"");	
	}
	}
}
