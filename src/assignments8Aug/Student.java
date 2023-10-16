package assignments;

import java.util.ArrayList;

public class Student {
	   String name;
	   int grade;
	   ArrayList < String > courselist;

	  public Student(String name, int grade) {
	    this.name = name;
	    this.grade = grade;
	    this.courselist = new ArrayList < String > ();
	  }

	  public String getName() {
	    return name;
	  }

	  public int getGrade() {
	    return grade;
	  }

	  public ArrayList < String > getCourses() {
	    return courselist;
	  }

	  public void addCourse(String course) {
		  courselist.add(course);
	  }

	  public void removeCourse(String course) {
		  courselist.remove(course);
	  }
	  public void printStudentDetails() {
	    System.out.println("Student Name: " + name+ " and Grade is: " + grade);
	    System.out.println("Course List: "+this.courselist);
	  }

	}

