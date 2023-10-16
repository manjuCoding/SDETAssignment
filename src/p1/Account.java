package p1;
class Account {
	
	int accNo;  //class data members-available till end of class
	String ownerName;
	double accBal;
	public void initDate() {
	  //int d;  //local member-available till end of block	
		
		accNo=15;
		ownerName="Manju";
		accBal=2023.01;
	}

	public void dispaccDetails() {
		 System.out.println("Account no : "+accNo+"\n"+"accName : "+ownerName+"\n"+"AccountBal : "+accBal);
	}
	
	public void setaccNo(int accNo) //formal parameter
	{
		int No;
		this.accNo= accNo;
	}
	public int getMonth()
	{
		return accNo;
	}
}
