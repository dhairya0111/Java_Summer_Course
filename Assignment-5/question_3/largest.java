package question_3;
import java.util.Scanner;
class Asd {

	void fun(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first and Second String resp");
		int s1 = Integer.parseInt(input.next());
		int s2 = Integer.parseInt(input.next());
		
			if(s1>s2)
			System.out.println("maximum is " +s1);
		else
			System.out.println("maximum is " +s2);
	}
}
public class largest{

	public static void main(String[] args) {
		Asd obj = new Asd();
		obj.fun();
	}
}
