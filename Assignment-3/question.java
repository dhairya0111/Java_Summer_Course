package assignment_4;
import java.util.Scanner;
import java.lang.Math;
public class question {
	public static void Armstrong()
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter any number");
		int num=s.nextInt();
		int i,j,rem,flag=0,temp;
		double ans=0;
		temp=num;
		while(num>0)
		{
			flag++;
			num=num/10;
			
		}
		num=temp;
		while(num>0)
		{
			rem=num%10;
			ans+=Math.pow(rem, flag);
			num=num/10;
		}
		if(temp==ans)
		{
			System.out.print("Armstrong number");
		}
		else
			System.out.print("Not an Armstrong number");
	}
	public static void Pattern()
	{
		int i,j;
		for(i=0;i<5;i++)
		{
			for(j=5;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void EvenNum()
	{
		System.out.println("Enter number till which you want to print even numbers");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.println(+i);
			}
		}
	}
	public static void PrimeNum()
	{
		System.out.println("Enter number till which you want to print prime numbers");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int i,j,flag=0;
		for(i=2;i<=num;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
					flag++;
			}
			if(flag==0)
			{
				System.out.println(+i);
			}
			flag=0;
		}
	}
	public static void reverse()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number which you want to reverse");
		int num=s.nextInt();
		int rev=0,rem;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse of Number is "+rev);
	}

	public static void Sort()
	{
		int arr[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter numbers of array");
		int i,j,temp;
		for(i=0;i<5;i++)
		{
			arr[i]=s.nextInt();
		}
		for(i=0;i<4;i++)
		{
			for(j=i+1;j<5;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	public static void Search()
	{
		int i,j,ub,lb,search,middle;
		int arr[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter numbers of array");
		for(i=0;i<5;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Enter number you want to search");
		search=s.nextInt();
		ub=4;
		lb=0;
		middle=(ub+lb)/2;
		while(lb<=ub)
		{
			if(arr[middle]<search)
			{
				lb=middle+1;
			}
			if(arr[middle]==search)
			{
				System.out.print( search +"is found at "+middle +"position");
				break;
			}
			if(arr[middle]>search)
			{
				ub=middle-1;
			}
				middle=(lb+ub)/2;
		}
	}
		public static void main(String[] args)
		{
			Pattern();
			EvenNum();
			PrimeNum();
			Armstrong();
			reverse();
			Sort();
			Search();
			
		}
}
