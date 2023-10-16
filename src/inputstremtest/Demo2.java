package inputstremtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {
	
        File f1=new File("D:\\amit9.sql");
        
        FileInputStream fin=new FileInputStream(f1);
        
        int x;
         while((x=fin.read())!=-1)  
         {
        	 System.out.println((char )x);  //97->a
         }      
        
        
	}

}