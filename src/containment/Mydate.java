package containment;

public class Mydate {

	int d,m,y;  
	
	public  Mydate()  
	{
		d=15;
		m=5;
		y=2023;
		
	}         
	public Mydate(int d,int m,int y) 
	{
		this.d=d;   
		this.m=m;  
		this.y=y;  
		
	}
	 
	 public String toString() 
	  {
		  return  d + ":" + m + ":" + y;
	  }
	
} //end of MyDate class

