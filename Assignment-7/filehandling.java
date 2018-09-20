package assignment_9;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;

public class filehandling {

	public static void main(String[] args)throws IOException {
		File fi=new File("E:/classwork/acadview/abc.txt");

		fi.createNewFile();
//		fi.mkdirs();
		FileReader ip=new FileReader(fi);
		int reader;
		while((reader=ip.read())!=-1)
		{
			System.out.print((char)reader);
		//	reader=ip.read();
		}
		System.out.println();
		System.out.println(fi.getAbsolutePath());
	}

}
