package containment;

public class Student {
		
		int sno;
		String snm;
		Mydate d1;    //Contained object

		public Student(){
			sno=101;
			snm="sonali";
		
		}
		
		public Student(int sno,String snm,Mydate d1)
		{
			this.sno=sno;
			this.snm=snm;
			this.d1=d1; //
			

		}
		
		
		public String toString() {
			return sno + " " + snm + " " +d1;
		}

		}




