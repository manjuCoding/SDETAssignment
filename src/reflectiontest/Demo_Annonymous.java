	package reflectiontest;

	public class Demo_Annonymous {

		public static void main(String[] args) {
			
			//using Annonymous inner class
			A a1=new A() {
				
		  		public void show() {
					
					System.out.println("in annonymous show");	
				
		  		} }; 
			 //end of Annonymous class
			a1.show();
			A a2=() -> { System.out.println("in annonmous show a2");

			};
			a2.show();
		}
	}
