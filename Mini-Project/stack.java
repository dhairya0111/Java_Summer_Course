package assignment_11;

public class stack {

	public int arr[];
	int counter;

	
	stack() {
		arr=new int[5];
		counter=0;
	}
	public void Increase_Array(){
	
		int temp[]=arr;
		arr=new int[arr.length*2];
		for(int i=0;i<temp.length;i++)
		{
			arr[i]=temp[i];
		}
	}
	
 	public void push(int element)
	{
		if(arr.length>counter)
		{
			arr[counter]=element;
			counter++;
		}
		else
		{
			Increase_Array();
		}
		
		
	}
 	public void pop()
 	{
 		try {
 		if(counter>0)
 		{
 			counter--;
 		}
 	
 		else
 			throw new stackException("");
 			
 		}
 		catch(stackException e)
 		{
 			System.out.println("You are trying to delete element from an empty stack");

 		}
 	}
 	public boolean isEmpty()
 	{
 		if(counter==0)
 			return true;
 		else 
 			return false;
 	}
 	public void Empty()
 	{
 		arr=new int[0];
 		counter=0;
 		
 	}
 	
	
	
}
