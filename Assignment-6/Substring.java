package stringsPractice;
import java.util.Scanner;
public class Substring {

	public static void find_substr(String str, int n) {
		for (int i = 0; i < n; i++) 
	           for (int j = i+1; j <= n; j++)
	                System.out.println(str.substring(i, j));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		find_substr(s,s.length());
	}

}
