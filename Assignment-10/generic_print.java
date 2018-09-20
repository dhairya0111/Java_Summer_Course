package Assignment_13;

public class generic_print {


		  
		  
		  public static void main(String args[]) {
		   
		    Integer[] intgr = { 1, 2, 3, 4, 5, 6 };
		    Character[] chr = { 'D' ,'h', 'a', 'i', 'r','y','a'};
		    Double[] dbl = { 1.7, 9.2, 4.3, 5.89 };
		    

		    System.out.println("integer values");
		    print(intgr); 
		    System.out.println("character values");
		    print(chr);
		    System.out.println("double values");
		    print(dbl); 
		    
		  } 
		  public static <T> void print(T[] inputArray) {
			  
			    for (T printer : inputArray)
			      System.out.printf("%s \n", printer);

			  }

		}

