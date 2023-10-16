package defaultconstemployee;

public class WageEmployee extends Employee{
  int hoursWegeEmploye;
  float rateWageEmploye;
  
  public WageEmployee(int hours,float rate) {
	  this.hoursWegeEmploye=hours;
	  this.rateWageEmploye=rate;
  }
  public String toString() {
		return eno +" " + name + " " +salary;
	}
  public double calculateSalary()
	{
		return super.salary;
	}
  
}
