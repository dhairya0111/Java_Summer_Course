package assignment_5;
import java.util.Scanner;



	class Rectangle
	{
		int length, breadth;
		
		int CalculateArea()
		{ int lb,br;
			lb=this.length;
			br=this.breadth;
			return lb*br;
			
			
		}
	};

	public class Question_1 {

		public static void main(String[] args) {

			Scanner input =new Scanner(System.in);
			System.out.println("Enter length and breadth resp..");
			Rectangle obj=new Rectangle();
			obj.length=input.nextInt();
			obj.breadth=input.nextInt();
			int z=obj.CalculateArea();
			
			System.out.println(z);
		}
	
}
