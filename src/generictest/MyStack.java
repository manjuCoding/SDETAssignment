package generictest;

public class MyStack <T,X>{
	T obj1;
	X obj2;
	public MyStack(T obj1,X obj2)  //int no, String
	{
		this.obj1 =obj1;
		this.obj2=obj2	;	
	}
	
	public T getObj1()
	{
		return obj1;
	}
	public X getObj2()
	{
		return obj2;
	}
}
