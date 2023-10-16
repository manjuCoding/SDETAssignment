package exception;

public class Demo8 {
	public static void doMath() 
	{
		 int a=10,b=0;
	     
		 if(b==0)
			 throw new ArithmeticException("can not dived by zero");
		 System.out.println("division=" + (a/b));
	  
	}
	
	  
	//caller method//calling method
	public static void main(String[] args) {
		 System.out.println("welcome to java");
		  
		try {
		   doMath();
		} 
	  catch (ArithmeticException e)  //try with class Exception / IException
	  {
		
		  e.printStackTrace();
	  }
			
		   System.out.println("Seed Infotech");
		   System.out.println("End of code");
			
		}

	   
	


	}


