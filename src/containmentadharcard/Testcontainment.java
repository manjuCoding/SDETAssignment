package containmentadharcard;

public class Testcontainment {

	public static void main(String[] args) {
		Student s1=new Student(22,"BIT",new Adharcard(12346,"Amit",22));
        System.out.println(s1);
        
        Employee e1=new Employee (105,20000,new Adharcard(12346,"Amit",22));
        System.out.println(e1);
	}

}
