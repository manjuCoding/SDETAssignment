package defaultconstemployee;

public class Employee {
	 String name;
	   double salary;
	    int eno;
		
	    public Employee() {
	    	name="Amit";
	    	salary=2009990;
	    	eno=101;
	    }
	   
	    
	    public String toString() {
			return eno +" " + name + " " +salary;
		}
	    public double calculateSalary()
		{
			System.out.println("in emp sal method");
			return this.salary;
		}
		
		
		}



