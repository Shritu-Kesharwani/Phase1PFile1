package Package1;
import java.io.*;

public class fileWriter {

	public static void main(String[] args) {
		
		try 
		  { 
				FileWriter f = new FileWriter("E:\\JAVA\\oops.txt");
				
				try 
				{
					f.write("Java is a object oriented programming language");
					
				}
				finally
				{
					f.close();
				
				}
				System.out.println("data written successfully");
			}
			catch(IOException i)
			  {
				  System.out.println(i);
			  }
		
		// instead of try and catch block we can handle this exception using throws also

		
	}

	
}
