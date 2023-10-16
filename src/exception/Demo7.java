package exception;

public class Demo7 {
//called method
	public static void doMatch() throws ArithmeticException
	{ 
		int a=10,b=2;
		System.out.println("division=" +(a/b));
		
	}
	public static void main(String[] args) {
		System.out.println("Welcome to java");
		try { 
			doMatch();
			
		}
		catch (ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("Seed Infotech");
		System.out.println("End of Code");
	}
}
