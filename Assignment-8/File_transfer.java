package assignment_10;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_transfer {
	
	public static void transfer1() throws IOException {
		File f = new File("F://abc//a.txt");
		File f2 = new File("F:/b.txt");
		//System.out.println(f.isFile() + " " + f.canRead());
		
		 FileOutputStream fout = null;
			FileInputStream fin = null ;
			
		try {
		fin = new FileInputStream(f);
		
		fout = new FileOutputStream(f2);
		 int c;
		  while( (c = fin.read()) != -1) {
			  fout.write((char)c);
		 }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	/*try {
		 
			  
		  }
	 } catch (Exception e) {
		System.out.println("Error Boom");*/
	 finally {
		  fin.close();
		  fout.close();
	}
	
	}
	
	public static void main(String[] args) throws IOException {
		
		transfer1();

	}

}
 