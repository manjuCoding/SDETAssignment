package collectiontest;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Testassign {
public static void main(String[] args) throws IOException {
	
	Properties  p1= new Properties ();
	FileInputStream fin =new FileInputStream("f1.properties");
	 p1.load(fin);
     
     
     String s1=p1.getProperty("username");
     System.out.println("user="+ s1);
    
     String s2=p1.getProperty("password");
     System.out.println("password="+ s2);
  
  }
}

