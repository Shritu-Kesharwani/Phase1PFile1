package Package1;
import java.io.*;

// Get all information of file program
public class FileInfomartion {

	public static void main(String[] args) {
	   File f = new File("E:\\JAVA\\File1.txt");
	   if(f.exists())
	   {
		   System.out.println("File Name : "+f.getName());
		   System.out.println("File Locatiom : "+f.getAbsolutePath());
		   System.out.println("File Writeable : "+f.canWrite());
		   System.out.println("File Readbale : "+f.canRead());
		   System.out.println("File Size : "+f.length());
	     //System.out.println("File Removed : "+f.delete());
	   }
	   else 
	   {
		   System.out.println("Files Doesn't Exists");
	   }

	}

}


