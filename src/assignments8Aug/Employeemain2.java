package assignments2;

import java.time.LocalDate;

public class Employeemain2 {
	 public static void main(String[] args) {
		    Employee2 employee1 = new Employee2("Sarita", 50000, LocalDate.parse("2021-04-01"));
		    employee1.printEmployeeDetails();
		    System.out.println("Years of Service: " + employee1.getYearsOfService());   
}
}