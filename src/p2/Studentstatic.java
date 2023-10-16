package p2;

public class Studentstatic {
  
	int sno;
	String snm;
	 static String col_nm;
	 
	 public Studentstatic (int sno,String snm,String col_nm) {
		 this.sno=sno;
		 this.snm=snm;
		 this.col_nm=col_nm;
	 }
	 public  void show () {
		 System.out.println(sno+" "+snm+" "+col_nm);
	 }
	public static void display() {
		System.out.println("all student from MIT college");
	}
	public String toString() {
		return sno + " " + snm + " " +col_nm;
	}
	
}
