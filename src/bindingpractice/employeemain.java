package bindingpractice;

public class employeemain {

	public static void main(String[] args) {
		 Employee e1=new salesman(); 
		 System.out.println("total sal=" + e1.calculateSal()); 
	
		   Employee e2=new Developer(102,"soham",14000,5,50000);
		   System.out.println("total sal=" + e2.calculateSal()); 
	}

}
