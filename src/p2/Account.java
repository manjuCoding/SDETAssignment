package p2;

public class Account {
	static float interestRate;
	static 
	{
		interestRate = 5.6f;
	}
	public static void getInterestRate()
	{
		System.out.println("Interest Rate: "+ interestRate);
	}
}