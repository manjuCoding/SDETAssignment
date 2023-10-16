package exception;

public class Demo4 {

	public static void main(String[] args) {

		   System.out.println("welcome to java");
		
		
		  try {
		   
			  int a[]= {15,65,3,24,8};
			  for(int i=0;i<6;i++)
				  System.out.println(a[i]);
		  }
		  catch(ArrayIndexOutOfBoundsException e)
		  {
			  e.printStackTrace();
		  }
			
		   System.out.println("Seed Infotech");
		   System.out.println("End of code");
			
		}

}
