package p2;

public class Student {
	  int sno;
	  String snm;
	  String col_nm;

	  public Student () {
		  sno=101;
		  snm="Manju";
		  col_nm="MIT";
	  }
 public Student (int sno,String snm,String col_nm) {
	  this.sno=sno;
	  this.snm=snm;
	  this.col_nm=col_nm;
 }
 public String toString () {
	 return sno+" "+snm+" "+col_nm;
			 }
}
