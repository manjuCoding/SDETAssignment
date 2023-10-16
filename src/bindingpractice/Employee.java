package bindingpractice;

public class Employee {
   String name;
   double salary;
    int eno;
	
    public Employee() {
    	name="Amit";
    	salary=123456;
    	eno=101;
    }
    public Employee(String name,double salary,int eno) {
    	this.name=name;
    	this.salary=salary;
    	this.eno=eno;
    }
    public String toString() {
		return eno +" " + name + " " +salary;
	}
    public double calculateSal()
	{
		System.out.println("in emp sal method");
		return salary;
	}
	
	
	}

