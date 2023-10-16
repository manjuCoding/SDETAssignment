package collectionSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoHashset {
public static void main(String[] args) {
	Set<String> s1=new HashSet<>();
	s1.add("C");
	s1.add("vb.net");
	s1.add("Java");
		//System.out.println(s1);
	
	Set<String> s2=new TreeSet<>();
	s2.add("C++");
	s2.add("rwd");
	s2.add("Java advance");
	
	
		ArrayList<Student> l1=new ArrayList<>();
		l1.add(new Student(101,"Amit",s1));
		l1.add(new Student(102,"ayushi",s2));
		System.out.println(l1);
}
}
