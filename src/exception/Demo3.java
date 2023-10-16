package exception;

public class Demo3 {
	public static void main(String[] args) {
		
		
		   System.out.println("welcome to java");
		   int a=10,b=0;
		
		  try {
		   System.out.println("division="+ (a/b));
		  }
		  catch(ArithmeticException e)
		  {
			  e.printStackTrace();
		  }
			
		   System.out.println("Seed Infotech");
		   System.out.println("End of code");
			
		}

	}


