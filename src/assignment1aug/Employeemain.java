package assignment1aug;

public class Employeemain {

public static void main(String[] args) {
     
		
		Employee e1= new Employee();  //create object or allocate memory of MyDate class
		e1.initEmployee();
		e1.dispEmployee();
		
		e1.setempid(7); 
		System.out.println(e1.getempid());
		System.out.println("after modification eid");
		e1.dispEmployee();
		
		e1.setempname("Amit"); 
		System.out.println(e1.getempname());
		System.out.println("after modification enm");
		e1.dispEmployee();
		
		e1.setsalary(34568908.876); 
		System.out.println(e1.getsalary());
		System.out.println("after modification sal");
		e1.dispEmployee();
}
}
