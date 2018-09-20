package assignmen_12;

import java.util.HashSet;
import java.util.Scanner;

public class set {

		

			HashSet<String> h = new HashSet<String>();
			HashSet<String> h2 = new HashSet<String>();
			
			public void Input()
			{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter elements of First Set");
			for(int i=0;i<4;i++)
			{
				String str=sc.next();
				h.add(str);
			}
			
			System.out.println("Enter elements of Second Set");
			for(int i=0;i<4;i++)
			{
				String str=sc.next();
				h2.add(str);
			}
			System.out.println(h);
			System.out.println(h2);
			
		    }
			public void Compare_and_Retain()
			{
				h.retainAll(h2);
				System.out.println("The Answe is "+h);
			}
		

	

	public static void main(String[] args) {
		
		set obj=new set();
		obj.Input();
		obj.Compare_and_Retain();
	}

}
