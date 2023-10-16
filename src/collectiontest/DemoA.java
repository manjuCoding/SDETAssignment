package collectiontest;
 import java.util.ArrayList;
  class Student {
  int sno;
  String name;
 
  public  Student() {
	  sno=101;
	  name="Manju";	  
  }
  public Student(int sno,String name)
  {
	   this.sno=sno;
	   this.name=name;
  }	
   
   public String toString() {
	   return sno + " " +name;
   }
  
 }
  public class DemoA{
	public static void main(String[] args) {
		ArrayList<Student> l1=new ArrayList <>();
		l1.add(new Student(102,"amit"));
		l1.add(new Student(103,"ankit"));
		l1.add(new Student(104,"aditya"));
		l1.add(new Student(105,"ayushi"));
		System.out.println(l1);
		System.out.println(l1.remove(2));
		System.out.println(l1);
	}
}
