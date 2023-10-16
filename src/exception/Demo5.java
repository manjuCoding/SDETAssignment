package exception;

 class Emp {

	int eno;
	String name;
	
	public Emp(){
		eno=101;
		name="sonali";
		
	}
	public void show()
	{
		System.out.println("in emp show method");
	}
}
public class Demo5 {
	
	  
	public static void main(String[] args) {
	
	
	   System.out.println("welcome to java");
	   try {
		     System.out.println("in try block statement 1");
	        Emp e1=null;
	
	       e1.show();
	   
	   System.out.println("in try block statement 2");  //never executed due to exception
	   }
	  
	   catch(NullPointerException e)
		{
			  e.printStackTrace();
		}
	   
	   System.out.println("Seed Infotech");
	   System.out.println("End of code");
		
	}
}
