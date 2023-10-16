package aug4inheritance;

public class saleperson extends Employee {
	int  commission,salesamt;
	public saleperson()
	{
		
		commission =500;
		salesamt=25000;
		
	    }
	saleperson(int eno,String name,int salary,int commission,int salesamt)
	{
		super (eno,name,salary);
		
		this.commission =commission;
		this.salesamt =salesamt;
	}
	public String toString() {
		return super.toString()+" "+commission+" "+salesamt;
		
	}
	public int calculatesal() {
			System.out.println("in emp sal method");
			return salary;
	}
	public int calculateCommission() {
		return commission*salesamt;
	}
	
}
