package bindingpractice;

public class Developer extends Employee {
	

		int Pno,pAmt;
		public Developer() {
			System.out.println("inside default constructor());");

		}
		public Developer(int eno,String name,double salary,int pno,int pAmt) {
			
			super (name,salary,eno);
			this.Pno=pno;
			this.pAmt=pAmt;
		}
			
		
			public String toString () {
				return super.toString()+" "+Pno+" "+pAmt;
			}
			public int calculateProjectAmt() {
				return Pno*pAmt;
			}
			public double calculateSal()
			{
				System.out.println("in development sal method");
				return salary;
			}
			}
	

