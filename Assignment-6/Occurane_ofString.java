package stringsPractice;
import java.util.Scanner;
public class Occurane_ofString {

	public static void main(String[] args) {
		int count = 0;
		int lastIndex = 0;
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		sc.close();
		while(lastIndex != -1)
		{
			lastIndex = str1.indexOf(str2, lastIndex);
			if(lastIndex != -1){
		        count ++;
		        lastIndex += str2.length();
		    }
		}
		System.out.println("Number of occurances: " + count);
	}
}