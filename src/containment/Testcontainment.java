package containment;

public class Testcontainment {

	public static void main(String[] args) {
		Student s1=new Student(104,"soham",new Mydate(15,5,23));  //one object contain another object
		System.out.println(s1);
		
		
		Employee e1=new Employee(117,"Adil",new Mydate(25,8,23));
		System.out.println(e1);
		
	  System.out.println();
		}


	}


