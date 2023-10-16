package exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo9{
   
     
    public static void main(String[] args) throws FileNotFoundException {
          FileInputStream f1=null;
   
       System.out.println("welcome to java");
      try {
       
          int a[]= {15,65,3,24,8};
          for(int i=0;i<6;i++)
              System.out.println(a[i]);
         
        f1=new FileInputStream("d:/manju.sql");
            System.out.println("file read successfuly");
      }
      catch(ArrayIndexOutOfBoundsException  | FileNotFoundException | ArithmeticException e)
      {
          e.printStackTrace();
      }
       
       System.out.println("Seed Infotech");
       System.out.println("End of code");
       
    }

}