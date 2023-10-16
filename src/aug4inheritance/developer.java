package aug4inheritance;

public class developer extends Employee {
	int Pno,pAmt;
	public developer(int eno,String name,int salary,int pno,int pAmt) {
		
		super (eno,name,salary);
		this.Pno=pno;
		this.pAmt=pAmt;
	}
		public String toString () {
			return super.toString()+" "+Pno+" "+pAmt;
		}
		public int calculateProjectAmt() {
			return Pno*pAmt;
		}

}
