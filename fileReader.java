package Package1;
import java.io.*;


public class fileReader {

	public static void main(String[] args) {
	try {	
		
			FileReader r = new FileReader("E:\\JAVA\\oops.txt");
			try 
			{
				int i;
				while((i=r.read())!=-1)
				{
					System.out.print((char)i);  // i return Aasci value so type casting to character
				}
			
			}
			finally
			{
				r.close();
			}
		}
		catch(IOException e)
		{
			System.out.println("Exception "+e);
		}

	}

}
