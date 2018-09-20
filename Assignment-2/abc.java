package assignment_2;
import java.util.Scanner;
public class abc {
	public static void AddNumbers()
	{
		Scanner s=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter numbers");
		a=s.nextInt();
		b=s.nextInt();
		c=a+b;
		System.out.println("The Sum is " +c);
	}
	public static void LeapYear()
	{
		Scanner s=new Scanner(System.in);
		int year;
		System.out.println("Enter year");
		year=s.nextInt();
		if(year%4==0)
		{
			System.out.println("It is Leap year");
		}
		else
			System.out.println("It is not a Leap year");

	}

	public static void Pattern()
	{
	int i,j;
	for(i=0;i<4;i++)
	{
		for(j=0;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
	}
	}
	public static void Biggest()
	{
		Scanner s=new Scanner(System.in);
		int num1,num2,num3;
		System.out.print("Enter three numbers");
		num1=s.nextInt();
		num2=s.nextInt();
		num3=s.nextInt();
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println("Number 1 is greatest");
			}
			else
				System.out.println("Number 3 is greatest");
		}
		else if(num1>num3)
		{
			System.out.println("Number 2 is greatest");
		}
		
		
	}
	public static void Palindrome()
	{
		Scanner s=new Scanner(System.in);
		int a=0,num,x,temp;
		System.out.println("Enter any number");
		num=s.nextInt();
		temp=num;
		while(num>0)
		{
			x=num%10;
			a=a*10+x;
			num=num/10;
		}
		
		if(temp==a)
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");
		
	}
	public static void Prime()
	{
		Scanner s=new Scanner(System.in);
		int num,flag=0;
		System.out.println("Enter any number to find if it is prime or not");
		num=s.nextInt();
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag++;
			}
		}
		if(flag==0)
		{
			System.out.println("Number is Prime");
		}
		else
			System.out.println("Number is not prime");
	}
	public static void Reverse()
	{
		Scanner s=new Scanner(System.in);
		int a=0,num,x,temp;
		System.out.println("Enter any number");
		num=s.nextInt();
		
		while(num>0)
		{
			x=num%10;
			a=a*10+x;
			num=num/10;
		}	
		System.out.println("Reverse of number is "+a);
	}
public static void main(String[] args)	
{
	Scanner s=new Scanner(System.in);
	
	AddNumbers();
	LeapYear();
	Pattern();
	Biggest();
	Palindrome();
	Prime();
	Reverse();
}
}

