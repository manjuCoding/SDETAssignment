package p1;

public class MyDate {
int dd,mm,yy;
public void initDate()
{
	dd=mm=yy=0;
}
public void setDate (int d, int m,int y)
{ 
	dd=d;
	mm=m;
	yy=y;
}
 public void dispDate()
 {
	 System.out.println("Date is : "+ dd + "-"+ mm + "-"+ yy);
 }
	public static void main(String[] args) {
	 MyDate d1;
	 d1 = new MyDate ();
	 d1.initDate ();
	 d1.dispDate();
	 d1.setDate(3,7,90);
	 d1.dispDate();

	}

}
