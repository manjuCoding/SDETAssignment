package override;
	 class A1 {
		 @Deprecated
			public void showEmployeesBasicDetails() {
				System.out.println("in class A");
			}
		}
		class B1 extends A{
			
			
			public void showEmployeesBasicDetails() {
				System.out.println("in class B");
				
			}
			public String toString() {
				return "d";
			}
			
		}
		public class Demo{
			public static void main(String[] args) {
				B1 b1=new B1();
					b1.showEmployeesBasicDetails();
			}
		}

