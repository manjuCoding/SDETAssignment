package generictest;

public class Demo2<T,X> {
	T obj1;
	X obj2;
	public Demo2(T obj1,X obj2)  //int no, double no
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
	public static void main(String[] args) {
		
		Demo2<Integer,String> d1=new Demo2<Integer,String>(15,"manju");
		  int a=d1.getObj1();
		  System.out.println(a);
		
		  String str=d1.getObj2();
		  System.out.println(str);
		
		
			
		
	}

}