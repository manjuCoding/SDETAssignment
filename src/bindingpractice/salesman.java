package bindingpractice;

public class salesman extends Employee {
	int  commission,salesamt;
	public salesman()
	{
		
		commission =500;
		salesamt=25000;
		
	    }
	salesman(int eno,String name,int salary,int commission,int salesamt)
	{
		super (name,salary,eno);
		
		this.commission =commission;
		this.salesamt =salesamt;
	}
	public String toString() {
		return super.toString()+" "+commission+" "+salesamt;
		
	}
	public double calculateSal()
	{
		System.out.println("in salesman sal method");
		return salary;
	}
	public int calculatecommission() {
		System.out.println("in salesman commission method");
		return commission;
	}
	}

