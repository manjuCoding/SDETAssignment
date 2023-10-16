package exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Demo1 {
public static void main(String[] args) {
	System.out.println("Welcom to java");
	int a=10,b=2;
	try {
		FileInputStream f1=new FileInputStream("d:/amit9.sql");
		System.out.println("file read successfuly");
	}
    catch (FileNotFoundException e)  //try with class Exception / IOException
	  {
        
    	  System.out.println("file not present");
 
   
   System.out.println("Seed Infotech");
   System.out.println("End of code");
   
}



}
}

