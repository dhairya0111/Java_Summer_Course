package assignmen_12;
import java.util.*;
public class map {

	HashMap<String,Integer> hash=new HashMap<String,Integer>();
	void input_and_print()
	{
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter elements");
		for(int i=0;i<5;i++)
		{
			String str=sc.nextLine();
			int n=s.nextInt();
			hash.put(str, n);
		}
		
		for(Map.Entry x:hash.entrySet()){
			   System.out.println(x.getKey()+"------->>>> "+x.getValue());
			  }
		
	}
	
	 public static void main(String[] args) {
		  
		  map obj=new map();
		  obj.input_and_print();
}
}