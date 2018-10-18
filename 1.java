/*class a
{
	public static void main(String[] args) {
		int i=0,sum=0,y;
		///String a[];
		for(i=0;i<args.length;i++)
		{
			String [] arr = args[i].split(",");


		
		for(String b : arr)
		{
			y=Integer.parseInt(b);
			sum=sum+y;

		}
		System.out.print(+sum);
}
	}
}*/

 class ab
{
	public static void main(String args[])
	{
		int i,count =0,sum1=0;
		for(i=0;i<args.length;i++)
		{
			count=0;
		String [] arrOfStr = args[i].split(",");
int y,sum=0;
		for (String a : arrOfStr)
		{
			count++;
			y=Integer.parseInt(a);
			sum=sum+y;
		}
	System.out.println(sum);
	System.out.println((float)sum/count);
	System.out.println("----------****----------");
sum1=sum1+sum;
}
System.out.println("Total is : "+sum1);
int x=sum1,c=0,rem=0;
while(x!=0)
{
	rem=rem*10+x%10;
	x=x/10;
c++;
	}
	if(rem==sum1)
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not Palindrome");
	}
//ystem.out.println(rem);
}
}
