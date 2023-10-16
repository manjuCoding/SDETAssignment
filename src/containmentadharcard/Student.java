package containmentadharcard;

public class Student {
     int srn;
     String cname;
     Adharcard a1;
     public Student() {
    	 srn=22;
    	 cname="BIT";
     }
     public Student(int srn,String cname, Adharcard a1) {
    	 this.srn=srn;
    	 this.cname=cname;
    	 this.a1=a1;
     }
     public String toString () {
    	 return  srn + " " + cname + " " +a1;
     }
}
