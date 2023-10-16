package checkPackage;

public class Account {
  private int ano = 1213231;
  String name= "Manju";
class Locker{
	 private int lno=456;

	public void disLockerNo()
	{
		System.out.println("locker no="+lno+"Locker account="+ano+"account name="+name);
	}
}
public void disAccountDetails() {
	System.out.println("account no="+ano+"account name="+name);
}
public static void main(String[] args) {
	Account a1=new Account();
	a1.disAccountDetails();
	//can access inner class using outer class object
	Locker l1=new Account().new Locker();
	l1.disLockerNo();
	
	Locker l2=a1.new Locker();   //access inner class using outer class reference
	l1.disLockerNo();
}
}
