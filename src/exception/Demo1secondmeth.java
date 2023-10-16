package exception;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1secondmeth {

	
	                 //called method
	public static void ReadFile() throws FileNotFoundException
	{
		
	 FileInputStream f1=new FileInputStream("d:/manju.sql");
		System.out.println("file read successfuly");
	  
	}
	
	  
	//caller method//calling method
	public static void main(String[] args) {
		 System.out.println("welcome to java");
		   int a=10,b=2;
		try {
		   ReadFile();
		} 
	  catch (FileNotFoundException e)  //try with class Exception / IException
	  {
		
		  e.printStackTrace();
	  }
			
		   System.out.println("Seed Infotech");
		   System.out.println("End of code");
			
		}

	   
	}


