package assignment_5;
import java.util.Scanner;
class Waveform
{
	 Scanner input=new Scanner(System.in);
	void fun()
	{
		
		int arr[]=new int[10];

        int i,j,temp=0;
        for(i=0;i<10;i++)
             arr[i]=input.nextInt();




        for(i=0;i<arr.length;i++)
		{
        	
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[j] < arr[i])
				{
					 temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

                 for(i=0;i<10;i=i+2)
                 {
                     temp=arr[i+1];
                     arr[i+1]=arr[i];
                     arr[i]=temp;
                 }

                 for(i=0;i<10;i++)
                 	{
                	 System.out.print(arr[i]+" ");
                 	}
	}
}
public class Question_4 {
	 public static void main(String[] args){
	        System.out.println("Enter 10 numbers");
	        Waveform obj=new Waveform();
	        obj.fun();
	     
	    }
}
