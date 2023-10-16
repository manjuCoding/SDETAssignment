package object;

public class Demo1 {

	public static void main(String[] args) {
		String s1="Pune";
		String s2="Pune";
		if (s1.equals(s2))
			System.out.println("data is same");
		else
			System.out.println("data is not same");
		if (s1==s2)
			System.out.println("data is same");
		else
			System.out.println("data is not same");
		String s3=new String ("infotech");
		String s4=new String ("Pune");
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		if(s3.equals(s4))
			System.out.println("data is same");
		else
			System.out.println("data is not same");
		if(s3==s4)
			System.out.println("data is same");
		else
			System.out.println("data is not same");

	//System.out.println("delsted string="+ s3.delete(0, 2));
	//System.out.println("reversse string="+ s3.reverse());
    // System.out.println("append="+ s3.append("seed"));
		
		System.out.println("append="+ s3.concat("seed"));
	}

}
