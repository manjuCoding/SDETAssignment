package assignments;

public class Employeemain {

	public static void main(String[] args) {

		
		Employee e1= new Employee();  
		e1.dispEmployee();
		
		e1.setjobtitle("Manager"); 
		System.out.println(e1.getjobtitle());
		System.out.println("after modification jobtitle ");
    	e1.dispEmployee();
		
		e1.setname("Amit"); 
		System.out.println(e1.getname());
		System.out.println("after modification name ");
		e1.dispEmployee();
		
		e1.setsalary(3456890); 
		System.out.println(e1.getsalary());
		System.out.println("after modification sal ");
		e1.dispEmployee();
	}
}
