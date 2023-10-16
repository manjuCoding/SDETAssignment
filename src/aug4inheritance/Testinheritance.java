package aug4inheritance;

public class Testinheritance {
public static void main(String[] args) {
		
//		saleperson s2=new saleperson();
//		System.out.println(s2);
		
		Employee e1=new saleperson();
		System.out.println("total sal =" e1.calculatesal());
//		System.out.println("salary="+s1.calculateSal());  //calling common method
//		System.out.println("commission="+s1.calculateCommission());
		

		
		Employee e2=new developer(102,"soham",14000,5,50000);
		System.out.println("total =" e2.calculatesal());
//		System.out.println("salary="+d1.calculateSal());  //calling common method
//		System.out.println("project amt="+d1.calculateProjectAmt());
	}

}