package reflectiontest;

public class Demodata {

	public static void main(String[] args) {
	   
		displaydata d1=(int no,String n)-> {System.out.println("Roll No=" +no+"name="+n);};
		d1.displaydetails(101,"Manju");
	}
}