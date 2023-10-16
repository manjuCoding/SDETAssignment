package collectionSet;

import java.util.Set;

public class Student {
		int sno;
		String name;
		Set<Student>subjects;
		public Student() {
			sno=109;
			name="Amit";
		}
		public Student(int sno,String name,Set sub) {
			this.name=name;
			this.sno=sno;
			subjects=sub;
			}
		public String toString () {
			return sno+" "+name+" "+subjects;
		}
	}

