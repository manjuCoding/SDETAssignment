package containmentadharcard;

public class Employee {
     int empno;
     int salary;
     Adharcard a1;
     public Employee() {
    	 empno=105;
    	 salary=20000;
     }
     public  Employee(int empno,int salary,Adharcard a1) {
    	 this.empno=empno;
    	 this.salary=salary;
    	 this.a1=a1;
     }
     public String toString() {
    	 return empno + ":"+salary+":"+a1;
     }
}
