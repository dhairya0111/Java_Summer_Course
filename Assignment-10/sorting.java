package Assignment_13;
import java.util.Arrays;
import java.util.Collection;
import java .util.Scanner;


 class sort<X> {

		
		
			public void sort_array(X arr[])
			{
				Arrays.sort(arr);
				for(int i=0;i<5;i++)
				{
					System.out.println(arr[i]);
				}
			}
				/*int i,j;
				for(i=0;i<5;i++)
				{
					for(j=i+1;j<4;j++)
					{
						if(arr[i]>arr[j])
						{
							X temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
						}
					}
				}
			}*/
 }
		public class sorting{
			
		public static void main(String[] args)
		{
			System.out.println("Enter 5 numbers");
			sort<Integer> ob = new sort<Integer>();
			Integer arr[]=new Integer[5];
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<5;i++)
			{
				arr[i]=sc.nextInt();
			}
			ob.sort_array(arr);
			
		}
}

