package object;

public class Demo2Builder {
	public static void main(String[] args) {
		StringBuilder  s3=new StringBuilder ("Pune");
		StringBuilder  s4=new StringBuilder ("Pune");
		 System.out.println(s3.hashCode());
		 System.out.println(s4.hashCode());
  if (s3==s4)
 System.out.println("data is same");
  else
  System.out.println("data is not same");
  if(s3.equals(s4))
	  System.out.println("data is same");
  else
	  System.out.println("data is not same");
  System.out.println("delsted String=" +s3.delete(0, 2));
  System.out.println("reverse String="+s3.reverse());
  System.out.println("append="+s3.append("seed"));
	}

}


