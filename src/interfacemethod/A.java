package interfacemethod;

	interface B
	{
	    public void show();  

	}

	class Employee implements B
	{


	    public void show() {    
	        System.out.println("in emp show");
	    }
	   
	}

	class Student implements B

	{

	    public void show() {
	        System.out.println("in stud show");
	    }
	   
	}
	class A{
	    public static void main(String[] args) {
	       
	        //B b1=new B();  // can not create object of interface allow only to create reference
	        B b1=new Employee();
	          b1.show();
	         
	            B b2=new Student();
	              b2.show();
	    }
	}

