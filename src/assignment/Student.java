package assignment;

import java.util.Scanner;

public class Student {
    int sro;
    double spr;
    String snm;
    public void initstudent () {
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter student name");
    	snm= s.next();
    	System.out.println("Enter student roll no");
    	sro= s.nextInt();
    	System.out.println("Enter student percentage");
    	spr= s.nextDouble();
    }
    public void printDetails() {
    	System.out.println("studentname="+snm);
    	System.out.println("studentrollno="+sro);
    	System.out.println("studentpercentage="+spr);
    }
   
}
