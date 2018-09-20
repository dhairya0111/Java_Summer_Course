package stringsPractice;
import java.util.Scanner;
public class String_reverse {
	
	public static String reversal(String s)
	{
		String newstr = "" ;
		String word = "" ;
		int i=0;
		while(i<s.length())
		{
			if(s.charAt(i) == ' ')
			{
				if(newstr != "" && word != "")
				{
					newstr = word + " " + newstr;
				}
				if(newstr == "" && word != "")
					newstr = word;
				word = "";
			}
			else
			{
				word = word + s.charAt(i);
			}
			i++;
		}
		if(newstr != ""  && word != "")
						newstr = word +" " + newstr;
						
						if(newstr == "" && word != "") {
							newstr = word;
						}
		return newstr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		sc.close();
		System.out.println(reversal(str));
	}

}
