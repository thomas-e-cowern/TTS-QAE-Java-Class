import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsClass {

	
	public static void main(String[] args) {
//		System.out.println(getIntEAFP());
		writeToFileExample ();
	}

//	  public static int getIntEAFP() {
//	    Scanner s = new Scanner(System.in);
//	    System.out.println("Please enter a number.");
//	    try {
//	      return s.nextInt();
//	    } catch(InputMismatchException e) {
//	    	System.out.println(e);
//	      return 0;
//	    }
//	  }
	  
	  public static void writeToFileExample () {
		  File file = new File("/Users/tcowern/Documents/studentnametest.txt");
		  String line = null;
		  FileReader fileReader = null;
		  BufferedReader bufferedReader = null;
		  
		  // Create the file
		  try {
			  file.createNewFile();
			  
			  FileWriter writer = new FileWriter(file);
			  
			  // Write the file
			  writer.write("Alicia\n cbush\n Ethan\n Kenth\n Matthew\n Tom\n");
			  writer.flush();
			  writer.close();
			  
			  // Read the file
			  fileReader = new FileReader(file);
			  
			  bufferedReader = new BufferedReader(fileReader);
			  while ((line = bufferedReader.readLine()) != null) {
				  System.out.println(line);			  
			  }
			  
			  fileReader.close();
		  } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  } catch (Exception e) {
			  e.printStackTrace();
		} finally {
			  System.out.println("Finally Block");
		  }
	  }
}
