package bindingtest;

public class Account {
 String name;
 int accno;
  public Account() {
	  name="Manju";
	 accno=45432;
  }
  public Account( String name,int accno) {
	  this.name=name;
	  this.accno=accno;
  }

   public void print()
  {
    System.out.println("name:"+name+"accno:"+accno);
  }
}

