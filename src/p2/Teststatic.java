package p2;

public class Teststatic {

	public static void main(String[] args) {
		System.out.println(s1.sno+" "+s1.snm+" "+s1.col_nm);
		Student s1=new Student();
		System.out.println(s1);
  
		Student s2=new Student (102,"Amit","MIT");
		System.out.println(s2);
//		System.out.println(s1.sno+" "+s1.snm+" "+s1.col_nm);
	}

}
