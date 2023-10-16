package assignments;

public class Employee {
	String jobtitle;
	String name;
	int salary;
	
	Employee()   
	{
		jobtitle="HR";
		name="Manju";
		salary=15000;
		
	}
	public void dispEmployee() {
		System.out.println("Jobtitle: "+ jobtitle + " Name: " +name +" Salary: " +salary);
		}
	public void setjobtitle(String jobtitle)
	{
		this.jobtitle=jobtitle;
	}
	public String getjobtitle()
	{
		return jobtitle;
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
	public int getsalary()
	{
		return salary;
	}
	
	

}


