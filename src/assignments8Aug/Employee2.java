package assignments2;

import java.time.LocalDate;
import java.time.Period;

public class Employee2 {
	String name;
	double salary;
	LocalDate hireDate;
	
	public Employee2(String name, double salary, LocalDate hireDate) {
	    this.name = name;
	    this.salary = salary;
	    this.hireDate = hireDate;
	  }
	
    public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	public void setsalary(int salary)
	{
		this.salary=salary;
	}
	public double getsalary()
	{
		return salary;
	}
	public void sethireDate(LocalDate hireDate)
	{
		this.hireDate=hireDate;
	}
	public LocalDate gethireDate()
	{
		return hireDate;
	}
	 public int getYearsOfService() {
	     return Period.between(hireDate, LocalDate.now()).getYears();
		  }

	  public void printEmployeeDetails() {
		    System.out.println("\nName: " + name+"\nSalary: " + salary+"\nHireDate: " + hireDate);
		   
}
}