package p1;
class condate1{
	
	int d,m,y;
	public condate1()
	{
		d=15;
		m=5;
		y=2023;
	}
		public condate1(int d1,int m1,int y1)
		{
			d=d1;
			m=m1;
			y=y1;
		}
		public condate1(int d1,int m1)
		{d=d1;
		m=m1;
		
	}
		public String toString()
		{
			return d+":"+m+":"+y;
		}
}

