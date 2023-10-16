package assignment;

import java.util.Scanner;

public class Employee {

	int empid;
	String enm;
	float sal;
	public void initemp() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter emp id");
		empid=s.nextInt();
		System.out.println("Enter emp name");
		enm=s.next();
		System.out.println("Enter emp  sal");
		sal=s.nextFloat();
	}
	public void displyinfo() {
		System.out.println("employee id:"+empid);
		System.out.println("employee name:"+enm);
		System.out.println("employee sal:"+sal);
	}
	

}
