package aug4inheritance;

public class Employee {
	int eno;
	String name;
	int salary;
	int pf,hra,ma,pt;
	
	Employee()   //default constructor
	{
		eno=101;
		name="sonali";
		salary=15000;
		pf=1500;
		hra=1200;
		ma=1000;
		pt=150;
	}
	Employee(int eno, String name, int salary)   //Parameterized constructor
	{
		this.eno=eno;
		this.name=name;
		this.salary=salary;
		pf=1500;
		hra=1200;
		ma=1000;
		pt=150;
	}
	
	public String toString() {
		return eno +" " + name + " " +salary;
	}
	
	public int calculateSal()
	{
		System.out.println("in emp sal method");
		return salary+pf+hra+ma+-pt;
	}
	

}

