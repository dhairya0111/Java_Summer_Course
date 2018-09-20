package stringsPractice;
import java.util.Scanner;
public class VowelsRemoval {
	
	public static String vowelRemove(String str)
	{
		int i=0;
		String s1 = "";
		while(i<str.length())
		{
			if(str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u' && str.charAt(i) != 'A' && str.charAt(i) != 'E' && str.charAt(i) != 'I' && str.charAt(i) != 'O' && str.charAt(i) != 'U')
			{
				s1 = s1 + str.charAt(i);
			}
			i++;
		}
		return s1;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		System.out.println(vowelRemove(s));
	}

}
