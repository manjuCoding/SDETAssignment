package generictest;

public class Demo <T> {
		T num;
		
		public Demo(T no)  //int no, double no
		{
			num=no;
		}
		
		public T getObj()
		{
			return num;
		}

		public static void main(String[] args) {
			
			Demo<Integer> d1=new Demo<Integer>(15);
			  int a=d1.getObj();
			  System.out.println(a);
			
			  
			Demo<String> d2=new Demo<String>("sonali");
			  String str=d2.getObj();
			  System.out.println(str);
			
			Demo<Float> d3=new Demo<Float>(15.2f);
			  float b=d3.getObj();
			  System.out.println(b);
			
				
			
		}

	}