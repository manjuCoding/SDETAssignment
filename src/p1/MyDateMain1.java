package p1;

public class MyDateMain1 {

	public static void main(String[] args) {
     
		
		MyDate1 d1= new MyDate1();  //create object or allocate memory of MyDate class
		d1.initDate();
		d1.dispDate();
		
		d1.setMonth(7);  //function/method call with parameter
		System.out.println(d1.getMonth());
		System.out.println("after modification date");
		d1.dispDate();
		
		d1.setDate(17);  //function/method call with parameter
		System.out.println(d1.getDate());
		System.out.println("after modification date");
		d1.dispDate();
		 
		
		d1.setYear(1990);  //function/method call with parameter
		System.out.println(d1.getYear());
		System.out.println("after modification date");
		d1.dispDate();
		        
		        

	}

}
