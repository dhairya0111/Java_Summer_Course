package stringsPractice;
//import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		String str = "abc";
		char [] a = str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(a[j]);
			}
			System.out.println();
		}
	}

}
