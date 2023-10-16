package uncheckedtest;

 class Emp1{
	int eno;
		String name;
		
		public Emp1(){
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
		
		
		   System.out.println("welcome to pune");
		   try {
			   int a=10,b=2;
			     System.out.println("division=" + (a/b));
			     System.out.println("in try block statement 1");
		       Emp1 e1=new Emp1();
		
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



