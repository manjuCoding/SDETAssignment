package p1;

public class overloading {
	public void sum (int a,int b)
	{
		System.out.println(a+b);
	}
    public void sum (int a)
    {
    	System.out.println(a*a);
    }
    public float sum (float a,float b)
    {
    	return a/b;
}
    public double sum (double a,double b)
    {
    	return a-b;
    }
}
