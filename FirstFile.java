package Package1;
import java.io.*;

// File Creation program

public class FirstFile {

	public static void main(String[] args) {
		File f = new File("E:\\JAVA\\File1.txt");
		try {
			
			if(f.createNewFile())
			{
				System.out.println("File created succesfully");
			}
			else
			{
				System.out.println("File already exist");
			}
			
		}
		catch(IOException i)
		{
			System.out.println("Exception Handled");
		}
			
	}

	
}
