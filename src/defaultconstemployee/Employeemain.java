package defaultconstemployee;

public class Employeemain {

	public static void main(String[] args) {
		Employee e1=new WageEmployee(8,5.6f);
		System.out.println("total sal=" + e1.calculateSalary());
	}

}
