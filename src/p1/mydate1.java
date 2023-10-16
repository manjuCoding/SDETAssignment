package p1;
class MyDate1 {
	
	int d,m,y;  //class data members-available till end of class
	
	public void initDate() {
	  //int d;  //local member-available till end of block	
		
		d=15;
		m=5;
		y=2023;
	}

	public void dispDate() {
		System.out.println("Date=" + d + ":" + m + ":" + y);
	}
	
	public void setMonth(int month) //formal parameter
	{
		m=month;
	}
	public int getMonth()
	{
		return m;
	}
	public void setDate(int d1) //formal parameter
	{
		d=d1;
	}
	public int getDate()
	{
		return d;
	}
	public void setYear(int year) //formal parameter
	{
		y=year;
	}
	public int getYear()
	{
		return y;
	}
	
	
} //end of MyDate class




