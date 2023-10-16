package override;

 class A {

	public void showEmployeesBasicDetails() {
		System.out.println("in class A");
	}
}
class B extends A{
	
	@Override
	public void showEmployeesBasicDetails() {
		System.out.println("in class B");
		
	}
	public String toString() {
		return "d";
	}
	
}
public class Demo1{
	public static void main(String[] args) {
		B b1=new B();
			b1.showEmployeesBasicDetails();
	}
}