package mini_project_1;

import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileExplorer {

	ArrayList<File> myfiles=new ArrayList<>();
    public void paths() throws IOException
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the path of which files you want to print");
        String path1 = sc.nextLine();
        System.out.println("Enter the path of second file");
        String path2 = sc.nextLine();
       /* sc.close();*/

        File f1 = new File("F:\\abc.txt");
        f1.createNewFile();
        FileWriter fw1 = new FileWriter(f1);
        fw1.write(path1 + "\n" +path2);
        
        
        fw1.flush();
       /* fw1.close();*/
    System.out.println("FirstLine");
        FileReader reader=new FileReader(f1);
		BufferedReader breader=new BufferedReader(reader);
		String location = breader.readLine();
		System.out.println("Location is " + location);
       
        	File fi=new File(location);
        	enlisting(fi);
        	
        	System.out.println(myfiles.size());
    	
        breader.close();
        File f2=new File("F:\\pathDirectory.csv");
        f2.createNewFile();
        FileWriter wrt=new FileWriter(f2);
		BufferedWriter b11=new BufferedWriter(wrt);
        for(File f0:myfiles)
        {
        	b11.write("File Name= "+f0.getName()+","+"Path---->>>"+f0.getAbsolutePath());
        	b11.newLine();
        }
        System.out.println("***Success***");
        b11.flush();
        b11.close();
        
    }
    public void enlisting(File f)
    {
    	
    	File arr[]=f.listFiles();
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i].isDirectory())
    		{
    			enlisting(arr[i]);
    		}
    		else
    			myfiles.add(arr[i]);
    	}
    }
    
}
