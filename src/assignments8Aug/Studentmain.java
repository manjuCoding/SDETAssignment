package assignments;

public class Studentmain {

	public static void main(String[] args) {
		DemoA s= new DemoA("Amit Singh", 1);
		s.printStudentDetails();
		
		s.addCourse("English");
		s.addCourse("Hindi");
		s.addCourse("Physics");
		s.addCourse("Math");
		
		s.getCourses();
		s.printStudentDetails();
		System.out.println("Removing some of the courses");
		s.removeCourse("Math");
		s.printStudentDetails();
	}

}
