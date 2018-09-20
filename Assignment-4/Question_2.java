package assignment_5;

import java.util.Scanner;

class Complex
{
	int real,imaginary ;
	void Display()
	{int r,i;
	r=this.real;
	i=this.imaginary;
	
		System.out.println(r+"+"+i+"i");
	}
	
	
	
	
	
}
public class Question_2 {

		public static void main(String[] args) {
			Scanner input =new Scanner(System.in);
			System.out.println("enter real and imaginary part");
			Complex obj=new Complex();
			obj.real=input.nextInt();
			obj.imaginary=input.nextInt();
			obj.Display();
				
	}

}
